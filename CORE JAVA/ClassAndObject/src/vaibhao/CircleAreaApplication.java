/*	WAP to create the class name as Circle with a following methods */

package vaibhao;
import java.util.*;
class Circle
{
	float r;
 void setRadius(float radius)//accept the radius 
 {
	 radius=r;
 }
 void showArea()
 {
	  double PI=3.14;
	  double area =3.14*r*r; //write here calculation logics of circle area and display it
	  System.out.println("The Radius of Circle "+area);
 }
}
public class CircleAreaApplication
{
 public static void main(String x[])
 {
	 Circle c = new Circle();
	 Scanner v=new Scanner(System.in);
	 System.out.println("Enter the Radius "); //create here object of scanner and accept the radius as input
	 float r=v.nextInt();
	 c.setRadius(r); //create the object of area and call setRadius and pass radius input as parameter
	 c.showArea(); //call showArea() for display the display the area
 }
}