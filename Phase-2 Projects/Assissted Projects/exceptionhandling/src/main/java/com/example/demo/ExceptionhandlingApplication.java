package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = "com.mphasis.controller")
public class ExceptionhandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionhandlingApplication.class, args);
	}

}
