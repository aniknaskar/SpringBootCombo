package com.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootComboApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootComboApplication.class, args);
	}

}
