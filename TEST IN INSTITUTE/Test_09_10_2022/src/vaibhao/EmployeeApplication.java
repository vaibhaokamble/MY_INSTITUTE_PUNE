package vaibhao;

import java.util.*;

class Employee{
	private int id;
	private String name;
	private int sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
public class EmployeeApplication {

	public static void main(String[] args) {
		LinkedHashMap hm=new LinkedHashMap();
		do {
			Scanner v = new Scanner(System.in);
			int choice;
			System.out.println("Press 1 : Add New Element in Map store key as number and value as string ");
			System.out.println("Press 2 : View All Employee from Map Collection");
			System.out.println("Press 3 : Search Employee by Using Its ID");
			System.out.println("Press 4 : Delete Employee by using its Id");
			System.out.println("Press 5 : Exit the Choice");
			System.out.println("Enter Your Chice");
			
			choice =v.nextInt();
			switch(choice) {
			case 1 :
				break;
			case 2 :
				break;
			case 3 :
				break;
			case 4 :
				break;
			case 5 :
				break;
			
			}
		}while(true);
	}
}
