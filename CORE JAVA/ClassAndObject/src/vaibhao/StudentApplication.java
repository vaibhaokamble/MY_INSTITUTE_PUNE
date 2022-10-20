package vaibhao;
class Student
{
	private int id;
	private String name;
	private float per;
	private int actualPaidFees;
	private int disFees;
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
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public int getActualPaidFees() {
		return actualPaidFees;
	}
	public void setActualPaidFees(int actualPaidFees) {
		this.actualPaidFees = actualPaidFees;
	}
	public int getDisFees() {
		return disFees;
	}
	public void setDisFees(int disFees) {
		this.disFees = disFees;
	}
}

class DiscountFees
{
	Student student;
	void setStudent(Student s)
	{
		student=s;
	}
	void checkDiscountEligibility(int per)
	{
		if(per>60)
		{
			int tFees=student.getActualPaidFees();
			int totalFees = 0;
			int actualPaidFees=totalFees*30/100;
			int studentNeedPay=tFees-actualPaidFees;
			student.setActualPaidFees(studentNeedPay);
			student.setDisFees(actualPaidFees);
		}
	}
	void show()
	{
		System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getPer()+"\t"+student.getActualPaidFees()+"\t"+student.getDisFees());
	}
}
public class StudentApplication {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setName("vaibhao");
		s.setPer(90);
		s.setActualPaidFees(100000);
		DiscountFees d=new DiscountFees();
		d.setStudent(s);
		d.checkDiscountEligibility(20);
		d.show();
	}
}
