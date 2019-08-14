package com.covalense.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.beans.MessageBean;

@Configuration
public class MessageConfig {
	@Bean
public MessageBean getMessageBean() {
	MessageBean messageBean=new MessageBean();
	messageBean.setMessage("Good Morning");
	return messageBean;
}
}
