	package com.nithin.springbootpractice.onetoone.unidirectional.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OnetooneUniDirectionalMapping {

	public static void main(String[] args) {
		SpringApplication.run(OnetooneUniDirectionalMapping.class, args);
	}

}
