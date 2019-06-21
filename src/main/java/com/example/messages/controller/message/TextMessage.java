package com.example.messages.controller.message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class TextMessage implements IMessage {
	
	private static Map<Integer,Message> messages = new HashMap<Integer,Message>();
	
	static {
		messages.put(1, new Message(1,"1-India"));
		messages.put(2, new Message(2,"2-Japna"));
		messages.put(3, new Message(3,"3-China"));
		messages.put(4, new Message(4,"4-Romania"));
	}
	
	@Override
	public int createMessage(Message msg) {
		int id = messages.size()+1;
		msg.setId(id);
		messages.put(id,msg);
		System.out.println("Added message "+msg);
		return id;
	}

	@Override
	public Message getMessage(int id) {
		return messages.get(id+1);
	}

	@Override
	public List<Message> getMessage() {
		System.out.println("Returning all messages " + messages);
		return new ArrayList<Message>(messages.values());
	}

	@Override
	public Message deleteMessage(int id) {
		if(messages.remove(id)!=null) {
			System.out.println("Deleted message for " + id);
		}
		return null;
	}

	@Override
	public Message updateMessage(Message msg) {
		System.out.println("Updated Message "+msg);
		messages.put(msg.getId(), msg);
		return msg;
	}
	
	
}
