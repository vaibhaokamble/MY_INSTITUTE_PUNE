package vaibhao;

class ABC 
{
	static int m;
	int n;
}
public class StatApplication {

	public static void main(String[] args) {
		ABC a1 = new ABC();
		ABC a2 = new ABC();
		a1.m=100;
		a1.n=200;
		System.out.println("With First Object");
		System.out.println("M is "+a1.m);
		System.out.println("N is "+a1.n);
		System.out.println("With Second Object");
		System.out.println("M is "+a2.m);
		System.out.println("N is "+a2.n);
	}
}