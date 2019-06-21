package com.example.messages.controller.message;

import java.util.List;

public interface IMessage {

	public int createMessage(Message message);
	public Message getMessage(int id);
	public List<Message> getMessage();
	public Message deleteMessage(int id);
	public Message updateMessage(Message msg);
}
