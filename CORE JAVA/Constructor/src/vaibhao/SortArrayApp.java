package vaibhao;

import java.util.*;

class Sort
{
	int a[];
	Sort(int a[])
	{
		this.a=a;
	}
	void BeforeSort()
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("a[%d]--->%d\n", i,a[i]);
		}
	}
	void performSort()
	{
		for(int i=0;i<a.length; i++)
		{
			for(int j=(i+1); j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	void  afterSort()
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("a[%d]--->%d\n", i,a[i]);
		}
	}
}
public class SortArrayApp {

	public static void main(String[] args) {
		Scanner v =new Scanner(System.in);
		int a[]=new int [5];
		System.out.println("Enter the value in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=v.nextInt();
		}
		Sort s = new Sort(a);
		System.out.println("Before a Sorting ");
		s.BeforeSort();		
		s.performSort();
		System.out.println("After a Sorting");
		s.afterSort();
	}
}