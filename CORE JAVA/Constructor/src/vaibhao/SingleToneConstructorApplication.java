package vaibhao;

class DB
{
	public DB()
	{
		System.out.println("I am single Tone Class");
	}
}
public class SingleToneConstructorApplication {

	public static void main(String[] args) {
		DB d1 = new DB();
		DB d2 = new DB();
		DB d3 = new DB();
	}
}