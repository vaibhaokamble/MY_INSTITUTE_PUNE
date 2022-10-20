package vaibhao;

public class Team {
	private Player player;

	public Team(Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public void show() {
		System.out.println(player.getId() + "\t" + player.getName());
	}
}
