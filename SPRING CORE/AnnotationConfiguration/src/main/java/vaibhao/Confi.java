package vaibhao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Confi {
	@Bean(name="e")
	public Employee getEmplooyee()
	{
		return new Employee();
	}
}
