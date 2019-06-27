package com.example.messages.controller.message;

import java.util.Objects;

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
	
	@Override
	public int hashCode() {
		return message.hashCode();
	}
	
	
	@Override
	public boolean equals(Object m2) {
		Message m = (Message) m2;
		
		if(this == m) {
			return true;
		}else if(!Objects.isNull(m) && this.id == m.id && this.message == m.message) {
			return true;
		}
		
		return false;
	}
}
