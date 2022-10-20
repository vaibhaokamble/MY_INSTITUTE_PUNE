package vaibhao;
class Square
{
	Square(int x)
	{
		System.out.printf("Square of interger is %d\n",x*x);
	}
	Square(float x)
	{
		System.out.printf("Square of float is %f\n",x*x);
	}
}
public class OverloadingSquareApp {

	public static void main(String[] args) {
		Square s1 = new Square(5);
		Square s2 = new Square(5.5f);
	}
}
