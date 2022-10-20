package vaibhao;

class Data
{
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

class Info
{
	void acceptInfo(Data ...data)
	{
		for(int i=0; i<data.length; i++)
		{
			System.out.println(data[i].getId() + "\t" + data[i].getName());
		}
	}
}
public class SumVariableArgument {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1.setId(1);
		d1.setName("vaibhao");
		Data d2 = new Data();
		d2.setId(2);
		d2.setName("kamble");
		Info i = new Info();
		i.acceptInfo(d1,d2);
	}
}
