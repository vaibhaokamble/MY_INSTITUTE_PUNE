package vaibhao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean(name="p")
	public Player getPlayer() {
		return new Player();
	}
}
