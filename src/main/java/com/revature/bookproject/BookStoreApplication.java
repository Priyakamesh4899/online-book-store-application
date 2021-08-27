package com.revature.bookproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication

public class BookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(BookStoreApplication.class);
	 }
}