package com.webstart.web;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@SpringBootApplication
public class WebStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebStartApplication.class, args);
	}
}
