package com.Service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="msgServiceB2C")
public class MessageServiceB2C {

	@ServiceActivator(inputChannel="msgChannelB2C", autoStartup="true")
	public void getMessageFromB2C(Message<String> msgB2C){
		System.out.println(msgB2C.getPayload());
	}
}
