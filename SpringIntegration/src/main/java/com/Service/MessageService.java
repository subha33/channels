package com.Service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="msgService")
public class MessageService {
	
	@ServiceActivator(inputChannel="msgChannel",autoStartup="true",outputChannel="msgChannelB2C")
	public String getMessage(Message<String> msg){
		String a2b = msg.getPayload();
		System.out.println(a2b);
		return a2b.concat(" World!!");
	}

}
