package com.ust.athena.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ust.athena")
public class AthenaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AthenaApiApplication.class, args);
	}

}
