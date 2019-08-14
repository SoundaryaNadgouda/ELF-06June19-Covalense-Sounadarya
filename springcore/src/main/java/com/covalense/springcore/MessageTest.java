package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.covalense.springcore.beans.MessageBean;
import lombok.extern.java.Log;

@Log
public class MessageTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageBean.class);
		MessageBean messageBean1 = applicationContext.getBean(MessageBean.class);

		messageBean1.setMessage("Hello");
		log.info(messageBean1.getMessage());

		MessageBean messageBean2 = applicationContext.getBean(MessageBean.class);

		log.info(messageBean2.getMessage());

		((AbstractApplicationContext) applicationContext).close();
	}

}
