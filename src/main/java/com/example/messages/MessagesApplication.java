package com.example.messages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagesApplication {

	public static void main(String[] args) {
		System.out.println("In Main...");
		SpringApplication.run(MessagesApplication.class, args);
	}

}
