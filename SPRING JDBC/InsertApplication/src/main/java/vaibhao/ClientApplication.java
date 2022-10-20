package vaibhao;
import java.util.*;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ClientApplication {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("conn.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		JdbcTemplate template=(JdbcTemplate) bf.getBean("template");
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the name email and contact");
		String name = v.nextLine();
		String email = v.nextLine();
		String contact=v.nextLine();
		template.execute("insert into spring values('"+name+"','"+email+"','"+contact+"')");
		System.out.println("Record Save Succefully ");
	}
}
