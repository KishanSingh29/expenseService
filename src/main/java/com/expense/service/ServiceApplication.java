package com.expense.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication {

	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	@PostConstruct
	public void printKafkaBootstrap() {
		System.out.println("🔥 ENV Bootstrap: " + env.getProperty("spring.kafka.bootstrap-servers"));
		System.out.println("🔥 System Bootstrap: " + System.getProperty("spring.kafka.bootstrap-servers"));
	}
}
