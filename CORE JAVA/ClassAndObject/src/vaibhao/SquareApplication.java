/*	WAP To input the number and calculate its Square*/

package vaibhao;

class Square{
	int number;
	void setValue(int n) {
		number=n;
	}
	void showSquare() {
		int square=number*number;
		System.out.printf("The Square is %d\n",square);
	}
}
public class SquareApplication {

	public static void main(String[] args) {
		Square s = new Square();
		s.setValue(5);
		s.showSquare();
	}
}
