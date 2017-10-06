package com.Service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="PriorityService")
public class MsgServicePriority {
	
	@ServiceActivator(inputChannel="PriorityChannel",autoStartup="true")
	public void getPriorityMessage(Message<String> msg){
	  System.out.println(msg.getPayload());
	}
	
}
