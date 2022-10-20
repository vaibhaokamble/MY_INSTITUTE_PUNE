package vaibhao;

import java.util.*;

public class College {
	private List<String> list;

	public void setStudent(List<String> list) {
		this.list = list;
	}

	public void show() {
		for (String s : list) {
			System.out.println(s);
		}
	}

}
