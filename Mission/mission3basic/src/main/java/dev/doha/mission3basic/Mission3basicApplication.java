package dev.doha.mission3basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Mission3basicApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mission3basicApplication.class, args);
	}

}
