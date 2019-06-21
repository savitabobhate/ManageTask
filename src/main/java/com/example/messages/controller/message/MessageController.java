package com.example.messages.controller.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0")
public class MessageController {
	
	@Autowired
	IMessage messageRepo;

	//Create A Messages
	@PostMapping("/message")
	public int createMessage(@RequestBody Message msg) {
		return messageRepo.createMessage(msg);
	}
		
	//Get All Messages
	@GetMapping("/message")
	public List<Message> getMessages() {
		return messageRepo.getMessage();
	}

	//Get A Messages
	@GetMapping("/message/{id}")
	public Message getMessages(@PathVariable int id) {
		return messageRepo.getMessage(id);
	}
	
	//Update A Message
	@PutMapping("/message")
	public Message updateMessage(@RequestBody Message msg) {
		return messageRepo.updateMessage(msg);
	}
	
	//Delete the given message
	@DeleteMapping("/message/{id}")
	public Message deleteMessage(@PathVariable int id) {
		return messageRepo.deleteMessage(id);
	}
}
