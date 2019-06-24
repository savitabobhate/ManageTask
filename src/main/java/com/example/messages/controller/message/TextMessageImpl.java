package com.example.messages.controller.message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class TextMessageImpl implements IMessage {
	
	private static Map<Integer,Message> messages = new HashMap<Integer,Message>();
	private static int TOTAL_MESSAGES_COUNTER = 0;
	
	static {
		messages.put(++TOTAL_MESSAGES_COUNTER, new Message(TOTAL_MESSAGES_COUNTER,"1-India"));
		messages.put(++TOTAL_MESSAGES_COUNTER, new Message(TOTAL_MESSAGES_COUNTER,"2-Japan"));
		messages.put(++TOTAL_MESSAGES_COUNTER, new Message(TOTAL_MESSAGES_COUNTER,"3-China"));
		messages.put(++TOTAL_MESSAGES_COUNTER, new Message(TOTAL_MESSAGES_COUNTER,"4-Romania"));
	}
	
	@Override
	public int createMessage(Message msg) {
		int id = ++TOTAL_MESSAGES_COUNTER;
		msg.setId(id);
		messages.put(id,msg);
		System.out.println("Added message "+msg);
		return id;
	}

	@Override
	public Message getMessage(int id) {
		return messages.get(id);
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
