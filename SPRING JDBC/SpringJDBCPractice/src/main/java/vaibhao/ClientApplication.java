package vaibhao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ClientApplication {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("conn.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		DriverManagerDataSource d = (DriverManagerDataSource) bf.getBean("first");
		if(d!=null)
		{
			System.out.println("Database is connected");
		}
		else
		{
			System.out.println("Database Is Not Connected");
		}
	}
}

