package vaibhao;

import java.util.*;

public class Company {
	private Map studentList;

	public Map getStudentList() {
		return studentList;
	}

	public void setStudentList(Map studentList) {
		this.studentList = studentList;
	}

	public void show() {
		Set keys = studentList.keySet();
		Iterator i = keys.iterator();
		while (i.hasNext()) {
			Object key = i.next();
			Object value = studentList.get(key);
			System.out.println(key + "\t" + value);
		}
	}
}
