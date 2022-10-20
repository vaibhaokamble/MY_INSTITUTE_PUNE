/* Create the Class Name as Rectangle with a following methods and write its logics. */
package vaibhao;

import java.util.*;

class Rectangle {
	int length;
	int width;

	void setLengthWidth(int len, int wid)// accept the radius
	{
		length = len;
		width = wid;
	}

	void showArea() {
		int Area = length * width; // write here calculation logics of circle area and display it
		System.out.println("The Area Of Rectangle is " + Area);
	}
}

public class RectangleAreaApplication {
	public static void main(String x[]) {
		Scanner v = new Scanner(System.in);// create here object of scanner and accept the length and width as input
		System.out.println("Enter the Length And Width");
		int length = v.nextInt();
		int Width = v.nextInt();
		Rectangle r = new Rectangle();// create the object of Rectangle and call setLengthWidth and pass radius
		r.setLengthWidth(length, Width);// input as parameter
		r.showArea(); // call showArea() for display the display the area
	}
}