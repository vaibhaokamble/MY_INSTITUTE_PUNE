/*  WAP to create the class name as Sort with two functions name as 
	acceptArray() ,beforeSort(),performSort(),afterSort() :
	1) acceptArray(): this function is used for accept the array 
	2)beforeSort(): this function can display the original array without sorting 
	3) performSort(): this function can perform the sorting 
	4) afterSort(): this function can display array after sorting. */

package vaibhao;

import java.util.Scanner;

class Sort
{
	int arr[];
	void acceptArray(int a[])
	{
		arr=a;
	}
	void beforeSort()
	{
		System.out.println("Before Sorting");
		for(int i=0; i<arr.length; i++)
		{
			System.out.printf("a[%d]-->%d\n",i,arr[i]);
		}
	}
	void PerformSort()
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=(i+1); j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	void afterSort()
	{
		System.out.println("After Sorting");
		for(int i=0; i<arr.length; i++)
		{
			System.out.printf("a[%d]-->%d\n",i,arr[i]);
		}
	}
}
public class SortApplication {

	public static void main(String[] args) {
		int a[] = new int[6];
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the value");
		for(int i=0; i<a.length; i++)
		{
			a[i]=v.nextInt();
		}
		Sort s = new Sort();
		s.acceptArray(a);
		s.beforeSort();
		s.PerformSort();
		s.afterSort();
	}
}
