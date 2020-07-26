package org.lanqiao.test;

import java.util.List;

import org.lanqiao.entity.Message;
import org.lanqiao.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MessageService messageService = (MessageService) context.getBean("messageService");
		//���
		Message message = new Message();
		message.setId(17);
		message.setName("rr");
		message.setAge(394);
		messageService.addMessage(message);
	
		//����id��ѯ
		int id = 16;
		List<Message> messageList = messageService.getMessageById(id);
		for(Message message1:messageList) {
			System.out.println(message1.toString());
		}
	}
	

}
