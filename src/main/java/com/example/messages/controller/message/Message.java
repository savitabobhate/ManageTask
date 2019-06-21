package com.example.messages.controller.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Message {
	int id;
	String message;
	
	public Message(int id, String message) {
		this.id = id;
		this.message = message;
	}
}
