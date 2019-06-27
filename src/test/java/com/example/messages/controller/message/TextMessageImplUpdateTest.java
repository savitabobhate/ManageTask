package com.example.messages.controller.message;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TextMessageImplUpdateTest extends TextMessageImpl {

	static TextMessageImpl tmi;
	static Message newMessage1 = new Message(1,"TestMessage1");
	static Message newMessage2 = new Message(2,"TestMessage2");
	static Message newMessage3 = new Message(3,"TestMessage3");
	static Message newMessage4 = new Message(4,"TestMessage4");
	
	@BeforeClass
	public static void setup() {
		tmi = new TextMessageImpl();
		cleanAllMessages();
		tmi.createMessage(newMessage1);
		tmi.createMessage(newMessage2);
		tmi.createMessage(newMessage3);
		tmi.createMessage(newMessage4);
	}
	
	private static void cleanAllMessages() {
		for(Message m:tmi.getMessage()) {
			tmi.deleteMessage(m.getId());
		}
	}

	//Test Read
	@Test
	public void testReadLength() {
		int newLength = tmi.getMessage().size();
		assertEquals(4,newLength);
	}
	
	
	
	//Test Read
	@Test
	public void testReadNotContains() {
		assertFalse(tmi.getMessage().contains(newMessage1));
		assertFalse(tmi.getMessage().contains(newMessage3));
	}
}
