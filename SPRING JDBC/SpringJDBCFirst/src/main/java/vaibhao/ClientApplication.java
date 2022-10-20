package vaibhao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("conn.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		DriverManagerDataSource d = (DriverManagerDataSource) bf.getBean("conn1");
		System.out.println(d);
		if (d != null) {
			System.out.println("Connected");
		} else {
			System.out.println("Not Connected");
		}
	}
}