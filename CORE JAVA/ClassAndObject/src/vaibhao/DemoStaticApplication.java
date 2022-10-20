package vaibhao;
class Stat
{
	static int m=100;
	int n=200;
}
public class DemoStaticApplication {

	public static void main(String[] args) {
		Stat s= new Stat();
		System.out.println("M is " +Stat.m);
		System.out.println("N is " +s.n);
	}
}
