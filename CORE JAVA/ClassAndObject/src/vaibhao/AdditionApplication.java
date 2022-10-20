/* WAP To input the number and calculate its Addition */

package vaibhao;

class Add{
	int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	void showAdd() {
		System.out.printf("The Addition is %d\n",a+b);
	}
}
public class AdditionApplication {

	public static void main(String[] args) {
		Add a = new Add();
		a.setValue(100,200);
		a.showAdd();

	}
}
