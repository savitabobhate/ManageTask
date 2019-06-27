package com.example.messages.controller.message;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TextMessageImplDeleteTest extends TextMessageImpl {

	static TextMessageImpl tmi;
	static int initLength;
	static Message newMessage = new Message(initLength+1,"TestMessage");
	
	@BeforeClass
	public static void setup() {
		tmi = new TextMessageImpl();
		tmi.createMessage(newMessage);
		initLength = tmi.getMessage().size();
	}
	
	@Test
	public void testDeleteLength() {
		tmi.deleteMessage(newMessage.getId());
		int newLength = tmi.getMessage().size();
		assertEquals(initLength-1,newLength);
	}
	
	@Test
	public void testDeleteNotContains() {
		assertFalse(tmi.getMessage().contains(newMessage));
	}
}
