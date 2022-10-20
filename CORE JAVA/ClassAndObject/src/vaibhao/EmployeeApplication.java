/* 	WAP to create the class name as Employee with following functions 
	name as void setDetail(String name,int id,long sal) and showDetails() */

package vaibhao;

class Employee
{
	String name;
	int id;
	long sal;
	void setDetails(String n,int i,long s)
	{
		name=n;
		id=i;
		sal=s;
	}
	void showDetails()
	{
		System.out.printf("%s\n%d\n%d\n",name,id,sal);
	}
}
public class EmployeeApplication {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setDetails("vaibhao", 1, 50000);
		emp.showDetails();
		}
}
