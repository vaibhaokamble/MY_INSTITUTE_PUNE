package vaibhao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Confi.class);
		Employee emp=(Employee)context.getBean("e");
		emp.show();
	}

}
