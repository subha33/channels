package com.Service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

@MessageEndpoint(value="pubSubdMsgServ")
public class MsgServPubSub implements MessageHandler{

	public void handleMessage(Message<?> msg) throws MessagingException {
		
		System.out.println("Inside pubSub handleMessage: "+msg);
	}
}
