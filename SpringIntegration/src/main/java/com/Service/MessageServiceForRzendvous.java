package com.Service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="rzendMsgServ")
public class MessageServiceForRzendvous {
	
	@ServiceActivator(inputChannel="rzendChannel",autoStartup="true")
	public void getPriorityMessage(Message<String> msg){
	
		System.out.println(msg.getPayload());
	}
}
