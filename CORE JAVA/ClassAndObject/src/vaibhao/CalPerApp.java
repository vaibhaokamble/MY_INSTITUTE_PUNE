/*  WAP to create the Class name as CalPer with two functions
	void setMarks() and showPer().
	In setMarks() function we have to pass six subject marks 
	and calculate its percentage */

package vaibhao;

class CalPer
{
	int sub1,sub2,sub3,sub4,sub5,sub6;
	void setMarks(int s1,int s2,int s3,int s4,int s5,int s6)
	{
		sub1=s1;
		sub2=s2;
		sub3=s3;
		sub4=s4;
		sub5=s5;
		sub6=s6;
	}
	void showPer()
	{
		int per=(sub1+sub2+sub3+sub4+sub5+sub6)/6;
		System.out.printf("The Percentage is %d\n", per);
	}
}
public class CalPerApp {

	public static void main(String[] args) {
		CalPer cp = new CalPer();
		cp.setMarks(60, 60, 60, 60, 60, 60);
		cp.showPer();
	}
}
