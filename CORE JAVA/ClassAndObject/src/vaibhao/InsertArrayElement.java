package vaibhao;
import java.util.*;
class InsertArray
{
	char c[];
	void setCharArray(char ch[])
	{
		c=ch;
	}
	void insertValueOnInsex(int index,char ch)
	{
		System.out.printf("Before  Inserting Charector\n");
		for(int i=0; i<c.length; i++)
		{
			System.out.printf("c[%d]---->%c\n",i,c[i]);
		}
		for(int i=(c.length-2); i>=index;i--)
		{
			c[i+1]=c[i];
		}
		System.out.printf("After  Inserting Charector\n");
		for(int i=0; i<c.length; i++)
		{
			System.out.printf("c[%d]---->%c\n",i,c[i]);
		}
	}
}
public class InsertArrayElement {

	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		InsertArray e=new InsertArray();
		char ch[]=new char[6];
		System.out.printf("Enter the value Array Charector\n");
		for(int i=0; i<(ch.length-1); i++)
		{
			ch[i]=v.nextLine().charAt(0);
		}
		e.setCharArray(ch);
		System.out.printf("Enter the Value And Index\n");
		char value=v.nextLine().charAt(0);
		int index=v.nextInt();
		e.insertValueOnInsex(index, value);
	}
}
