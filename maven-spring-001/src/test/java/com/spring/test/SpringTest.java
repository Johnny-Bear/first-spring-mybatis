package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Bean;

public class SpringTest {
	@Test
	public void test() {
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		Bean bean = context.getBean("bean", Bean.class);
		
		System.out.println(bean.toString());
	}

}
