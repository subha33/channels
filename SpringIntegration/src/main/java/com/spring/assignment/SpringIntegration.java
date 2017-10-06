package com.spring.assignment;

import java.io.File;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="fileService")
public class SpringIntegration {
@ServiceActivator(inputChannel="fileChannel",autoStartup="true", outputChannel="processedfileChannel")
	public void printFile(Message<File> file){
	System.out.println("Inside file Service class");
	  System.out.println(file.getPayload());
	
	}
}
