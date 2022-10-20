package vaibhao;

class Overload
{
	void calAdd(int x,int y)
	{
		System.out.printf("Addition is %d\n",x+y);
	}
	void calAdd(float x,float y)
	{
		System.out.printf("Addition is %f\n",x+y);
	}

}
public class OverloadingConstructorApplication {

	public static void main(String[] args) {
		Overload o=new Overload();
		o.calAdd(5,5);
		o.calAdd(5.3f, 3.1f);
	}
}
