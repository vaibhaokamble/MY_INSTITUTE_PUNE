package vaibhao;

import java.util.*;

class Home {
	private int id;
	private String name;

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
}

public class LocalVariable {

	public static void main(String[] args) {

		Home h[] = new Home[5];
		for (int i = 0; i < h.length; i++) {
			h[i]=new Home();
			Scanner v = new Scanner(System.in);
			System.out.println("Enter the id and name");
			int id = v.nextInt();
			String name = v.nextLine();
			h[i].setId(id);
			h[i].setName(name);
		}
		System.out.println("Display The Record Of Array Element");
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i].getId() + "\t" + h[i].getName());
		}
	}
}
