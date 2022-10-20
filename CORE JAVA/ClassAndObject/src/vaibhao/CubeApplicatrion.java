/* WAP To input the number and calculate its cube */

package vaibhao;

class Cube{
	int number;
	void setValue(int n) {
		number=n;
		}
	void showCube()
	{
		int Cube=number*number*number;
		System.out.printf("The Cube is %d\n",Cube);
	}
}
public class CubeApplicatrion {

	public static void main(String[] args) {
		Cube c =new Cube();
		c.setValue(5);
		c.showCube();
	}
}
