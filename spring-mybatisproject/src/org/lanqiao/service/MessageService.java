package org.lanqiao.service;

import java.util.List;

import org.lanqiao.entity.Message;

public interface MessageService {
	
	public void addMessage(Message message);
	
	public List<Message> getMessageById(int id);

}
