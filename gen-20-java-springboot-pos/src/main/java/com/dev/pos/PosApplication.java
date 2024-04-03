package com.dev.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosApplication.class, args);
	}

	/*public static void main(String[] args) {
		new SpringApplicationBuilder(PosApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
	}*/

}
