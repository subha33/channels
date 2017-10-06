package com.main;

import java.io.File;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.file.FileHeaders;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class MessageAppMain {
	
	
	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("Bean.xml");
		File file = null;
		MessageChannel channel = context.getBean("fileChannel", MessageChannel.class);
		Message<File> msg1 = MessageBuilder.withPayload(file).setHeader(FileHeaders.FILENAME, file.getAbsolutePath() ).build();
		channel.send(msg1);
		
//		MessageChannel channel = context.getBean("msgChannel", MessageChannel.class);
//		Message<String> msg1 = MessageBuilder.withPayload("hello").build();
//		channel.send(msg1);
//		
//		MessageChannel queuechannel = context.getBean("queueChannel", MessageChannel.class);
//		String str[] = {"A1","B2","H7","U9"};
//		for(String queue : str){
//		  Message<String> msg2 = MessageBuilder.withPayload(queue).build();
//		  queuechannel.send(msg2);
//		}
		
//		MessageGateway gateway = context.getBean("gateway",MessageGateway.class);
//		//Message<String> msg1 = MessageBuilder.withPayload("hello with gateway").build();
//		String ms = gateway.processTrade("shdvshgbue");
		
		
//		
//		MessageChannel prioritychannel = context.getBean("PriorityChannel", MessageChannel.class);
//		String str1[] = {"AA","BB","HH","UU"};
//		for(String priority : str1){
//			for(int i=0;i<str1.length;i++){
//				
//		    Message<String> msg3 = MessageBuilder.withPayload(priority).setHeader(IntegrationMessageHeaderAccessor.PRIORITY,10).build();
//		    prioritychannel.send(msg3);
//			}
//		}
//		
//		MessageChannel rzendchannel = context.getBean("rzendChannel", MessageChannel.class);
//		Message<String> msg4 = MessageBuilder.withPayload("hello !! Rzendvous").build();
//		rzendchannel.send(msg4);
////		
//		PublishSubscribeChannel pubSubchannel = context.getBean("pubSubChannel", PublishSubscribeChannel.class);
//		MsgServPubSub pubsub = context.getBean("pubSubdMsgServ",MsgServPubSub.class);
//		pubSubchannel.subscribe(pubsub);
//		Message<String> msg5 = MessageBuilder.withPayload("hello !! pubsub").build();
//		pubSubchannel.send(msg5);
//		
//		PublishSubscribeChannel BridgeChannel = context.getBean("pubSubBridgeChannel", PublishSubscribeChannel.class);
//		MsgServPubSub bridge = context.getBean("pubSubdMsgServ",MsgServPubSub.class);
//		BridgeChannel.subscribe(bridge);
//		Message<String> msg6 = MessageBuilder.withPayload("Message bridge implemented").build();
//		pubSubchannel.send(msg6);
	}
}
