package com.example.messages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagesApplication {

	public static void main(String[] args) {
		System.out.println("Starting the MessagesApplication");
		SpringApplication.run(MessagesApplication.class, args);
	}
}
