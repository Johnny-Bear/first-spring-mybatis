package org.lanqiao.service.impl;

import java.util.List;

import org.lanqiao.entity.Message;
import org.lanqiao.mappers.MessageMapper;
import org.lanqiao.service.MessageService;

public class MessageServiceImpl implements MessageService{
	
	private MessageMapper messageMapper;

	public void setMessageMapper(MessageMapper messageMapper) {
		this.messageMapper = messageMapper;
	}

	@Override
	public void addMessage(Message message) {
		messageMapper.addMessage(message);
		
	}

	@Override
	public List<Message> getMessageById(int id) {
		List<Message> messageList = messageMapper.getMessageById(id);
		return messageList;
	}

}
