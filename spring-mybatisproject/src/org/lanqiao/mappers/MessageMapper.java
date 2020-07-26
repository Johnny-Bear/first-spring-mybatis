package org.lanqiao.mappers;

import java.util.List;

import org.lanqiao.entity.Message;

public interface MessageMapper {
	
	public void addMessage(Message message);
	
	public List<Message> getMessageById(int id);

}
