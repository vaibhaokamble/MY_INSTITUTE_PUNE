package vaibhao;

class  A
{
	A()
	{
		this(5);
		System.out.println("I am default contructor ");
	}
	A(int x)
	{
		this(5f);
		System.out.println("I am parameterized constructor = " +x);
	}
	A(float x)
	
	{
		System.out.println("I am flaot parameter contructor = " +x);
	}
}
public class ContructorChainningApplication {

	public static void main(String[] args) {
		A a1 = new A(); //default
	}
}
