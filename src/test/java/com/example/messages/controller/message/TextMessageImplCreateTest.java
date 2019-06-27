package com.example.messages.controller.message;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TextMessageImplCreateTest extends TextMessageImpl {

	static TextMessageImpl tmi;
	static int initLength;
	static Message newMessage = new Message(initLength+1,"TestMessage");
	
	@BeforeClass
	public static void setup() {
		tmi = new TextMessageImpl();
		initLength = tmi.getMessage().size();
	}
	
	//Test create
	@Test
	public void testCreateLength() {
		tmi.createMessage(newMessage);
		int newLength = tmi.getMessage().size();
		assertEquals(initLength+1,newLength);
	}
	
	//Test create
	@Test
	public void testCreateContains() {
		assertTrue(tmi.getMessage().contains(newMessage));
	}
	
	//Test create
	@Test
	public void testCreateNotContains() {
		Message fakeMessage = new Message(initLength+111,"fakeMessage");
		assertFalse(tmi.getMessage().contains(fakeMessage));
	}
}
