package com.nithin.springbootpractice.lms.entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(LMSApplication.class, args);
	}

}
