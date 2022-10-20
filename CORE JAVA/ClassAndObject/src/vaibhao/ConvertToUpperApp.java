package vaibhao;

class ConverToUpper
{
	char ch[];
	void setCharArray(char c[])
	{
		ch=c;
	}
	void convertToUpper()
	{
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char) ((int)ch[i]-32);
			}
		}
		System.out.printf("after conversion is\n");
		for(int i=0; i<ch.length; i++)
		{
			System.out.printf("ch[%c]---->%c\n",i,ch[i]);
		}
	}
}
public class ConvertToUpperApp {

	public static void main(String[] args) {
		ConverToUpper cp = new ConverToUpper();
		char ch[]=new char[] {'v','a','i','B','h','a','v'};
		cp.setCharArray(ch);
		cp.convertToUpper();
	}
}
