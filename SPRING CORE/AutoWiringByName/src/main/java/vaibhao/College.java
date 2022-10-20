package vaibhao;

public class College {

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public void show()
	{
		System.out.println( student.getName() + "\t" + student.getId() + "\t" + student.getCourse() );
	}
}
