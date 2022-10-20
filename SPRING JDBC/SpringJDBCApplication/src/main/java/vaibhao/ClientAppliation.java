package vaibhao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ClientAppliation {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("conn.xml");
		BeanFactory context = new XmlBeanFactory(r);
		JdbcTemplate template = (JdbcTemplate) context.getBean("template");
		template.execute("insert into spring values('abc','abc@gmail.com',12345)");
		System.out.println("Record Save Success");
	}
}
