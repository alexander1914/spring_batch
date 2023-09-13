package com.spring.batch.app;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan({"com.spring.batch.config", "com.spring.batch.service",
	"com.spring.batch.listener"})
public class SpringBatchBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchBootApplication.class, args);
	}

}
