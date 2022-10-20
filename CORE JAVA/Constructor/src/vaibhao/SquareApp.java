package vaibhao;

import java.util.*;

class Squares {
	int number;

	Squares(int x) {
		number = x;
	}

	void showSquares() {
		System.out.printf("Square is %d\n", number * number);
	}
}

public class SquareApp {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the any number");
		int a = v.nextInt();
		Squares s = new Squares(a);
		s.showSquares();
	}
}
