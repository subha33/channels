package com.Service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

import com.Interface.MessageGateway;

@MessageEndpoint(value="queueService")
public class MessageServiceForQueue implements MessageGateway{
	// normal channel flow
@ServiceActivator(inputChannel="queueChannel",autoStartup="true")
	public void getPriorityMessage(Message<String> msg){
	  System.out.println("Inside queueChannel:--"+msg.getPayload());
	}

	public String processTrade(String s) {
		System.out.println("message gate: "+s);
		return s;
	}
	
	// for bridge implemetation
//@ServiceActivator(outputChannel="pubSubBridgeChannel",autoStartup="true")
//public void getPriorityMessage(Message<String> msg){
//  System.out.println("Inside queueChannel:--"+msg.getPayload());
//}
}
