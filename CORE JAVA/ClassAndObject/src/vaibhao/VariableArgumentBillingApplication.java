

package vaibhao;

class Product
{
	private String name;
	private String company;
	private int qty;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

class Bill
{
	void calBills(Product ...p)
	{
		int GrandTotal=0;
		System.out.println("Product Name Company Name Quantity Price");
		System.out.println("______________________________________________");
		for(int i=0; i<p.length; i++)
		{
			int total=p[i].getPrice()*p[i].getQty();
			System.out.println(p[i].getName()+"\t"+p[i].getCompany()+"\t"+p[i].getQty()+"\t"+p[i].getPrice());
			GrandTotal=GrandTotal+total;
		}
		System.out.println("____________________________________________________________________________________");
		System.out.println("\t\t\t\tGrand Total is " +GrandTotal);
	}
}
public class VariableArgumentBillingApplication {

	public static void main(String[] args) {
		Bill b = new Bill();
		Product p1=new Product();
		p1.setName("Bisuit");
		p1.setCompany("Parle-G");
		p1.setQty(2);
		p1.setPrice(10);
		
		Product p2=new Product();
		p2.setCompany("Mario");
		p2.setName("Sweet");
		p2.setQty(3);
		p2.setPrice(50);
		
		b.calBills(p1,p2);
	}
}