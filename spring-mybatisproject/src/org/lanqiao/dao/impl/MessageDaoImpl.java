package org.lanqiao.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.lanqiao.entity.Message;
import org.lanqiao.mappers.MessageMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class MessageDaoImpl extends SqlSessionDaoSupport implements MessageMapper{
	
	public SqlSession getSqlSession() {
		SqlSession sqlSession = super.getSqlSession();
		return sqlSession;
	}

	@Override
	public void addMessage(Message message) {
//		MessageMapper messageDao = sqlSession.getMapper(MessageMapper.class);
//		messageDao.addMessage(message);
		int messageDao = this.getSqlSession().insert("MessageMapper.addMessage", message);
	}

	@Override
	public List<Message> getMessageById(int id) {
		List<Message> messageList =this.getSqlSession().selectList("MessageMapper.getMessageById",id);
		return messageList;
	}

	

}
