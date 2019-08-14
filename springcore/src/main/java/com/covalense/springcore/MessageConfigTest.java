package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.covalense.springcore.beans.MessageBean;
import com.covalense.springcore.configuration.MessageConfig;

import lombok.extern.java.Log;
@Log
public class MessageConfigTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MessageConfig.class);
	MessageBean messageBean=applicationContext.getBean(MessageBean.class);
	
	log.info(messageBean.getMessage());
	
		((AbstractApplicationContext)applicationContext).close();

	}

}
