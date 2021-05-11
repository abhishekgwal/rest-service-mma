package com.mma.restservicemma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.mma.controller")
@EnableJpaRepositories("com")
@EntityScan("com")
public class RestServiceMmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceMmaApplication.class, args);
	}

}
