package vaibhao;

import java.util.*;

class EmpInfo
{
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
class Employee
{
	
	EmpInfo einfo;
	Employee(EmpInfo einfo)
	{
		this.einfo=einfo;
	}
	void showDetail()
	{
		System.out.println(einfo.getName()+"\t"+einfo.getId()+"\t"+einfo.getSal());
	}
}
public class EmployeeApplication {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the name id and salary ");
		String name=v.nextLine();
		int id=v.nextInt();
		int sal=v.nextInt();
		EmpInfo einfo = new EmpInfo();
		einfo.setName(name);
		einfo.setId(id);
		einfo.setSal(sal);
		Employee emp = new Employee(einfo);
		emp.showDetail();
	}
}
