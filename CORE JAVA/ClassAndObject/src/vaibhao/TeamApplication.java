/* WAP to create the class name as Player with field id, name and runs and 
	create the class name as Team with two methods void addNewPlayer() and 
	showPlayer(). In addNewPlayer() method pass reference of Player class and 
	in showPlayer() method display the information about the Player */

package vaibhao;


class Player
{
	int id;
	String name;
	int run;
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

class Team
{
	private Player player;
	public void addNewPlayer(Player player)
	{
		this.player=player;
	}
	public void showPlayer()
	{
		System.out.println(player.getId() + "\t" + player.getName() + "\t" + player.getRun());
	}
}
public class TeamApplication {

	public static void main(String[] args) {
		Team t = new Team();
		Player p = new Player();
		p.setId(10);
		p.setName("vaibhao");
		p.setRun(100000);
		t.addNewPlayer(p);
		t.showPlayer();
	}
}
