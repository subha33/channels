package com.Service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint(value="custService")
public class CustomerService {
	@ServiceActivator(inputChannel="custChannel",autoStartup="true")
	public void get(){
		System.out.println("Customer channel");
	}

}
