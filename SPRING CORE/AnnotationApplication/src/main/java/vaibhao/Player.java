package vaibhao;

import org.springframework.beans.factory.annotation.Value;

public class Player {
	@Value("1")
	private int id;
	@Value("Vaibhaoooo")
	private String name;
	@Value("500")
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
