package vaibhao;
import java.util.*;
class Add
{
	public Add(int x,int y)
	{
		System.out.println("Addition is "+(x+y));
	}
}
public class AddApp {

	public static void main(String[] args) {
		Scanner v =new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a=v.nextInt();
		int b=v.nextInt();
		Add ad = new Add(a,b);
	}
}
