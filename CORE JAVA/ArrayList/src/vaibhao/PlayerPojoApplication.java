package vaibhao;

import java.util.*;

class Player {
	private int id;
	private String name;
	private int run;

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

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
}

public class PlayerPojoApplication {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		do {
			Scanner v = new Scanner(System.in);
			int id;
			String name;
			int run;
			int choice;
			System.out.println("Enter your choice");
			choice = v.nextInt();
			System.out.println("Press 1 : Enter The Name Id And Run Of Player");
			System.out.println("Press 2 : Display The All Player Details");
			System.out.println("Press 3 : Enter The Id For Delete  The Player Record");
			System.out.println("Press 4 : Enter The Id For Search The Player Record");
			System.out.println("Press 5 : Exit");
			choice = v.nextInt();
			switch (choice)

			{
			case 1:
				v.nextLine();
				Player p1 = new Player();
				System.out.println("Enter the id name and Run of Player");
				id = v.nextInt();
				name = v.nextLine();
				run = v.nextInt();
				p1.setId(id);
				p1.setName(name);
				p1.setRun(run);
				al.add(p1);
				break;

			case 2:
				System.out.println("Display The All Player Details");
				for (Object obj : al) {
					Player p = (Player) obj;
					System.out.println("\n" + p.getId() + "\t" + p.getName() + "\t" + p.getRun() + "\n");
				}
				break;

			case 3:
				System.out.println("Enter the Id for delete the player record");
				id = v.nextInt();
				boolean flag = false;
				for (Object obj : al) {
					Player p = (Player) obj;
					int pid = p.getId();
					if (id == pid) {
						al.remove(p);
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("Player Deleted Success");
				} else {
					System.out.println("Player Not Found");
				}
				break;

			case 4:
				System.out.println("Enter the Id for search the Player Record");
				id = v.nextInt();
				flag = false;
				for (Object obj : al) {
					Player p = (Player) obj;
					int pid = p.getId();
					if (id == pid) {
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("Player Found");
				} else {
					System.out.println("Player Not Found");
				}
				break;
			default:
				System.out.println("Wrong Choice");
			}
		} while (true);
	}
}
