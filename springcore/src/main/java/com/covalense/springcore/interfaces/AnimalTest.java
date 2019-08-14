package com.covalense.springcore.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.MessageBean;
import com.covalense.springcore.configuration.MessageConfig;

public class AnimalTest {

	
		public static void main(String[] args) {
			ApplicationContext context=new AnnotationConfigApplicationContext(PetConfig.class);
			PetBean pet=context.getBean(PetBean.class);
			pet.getInfo();
	

	}

}

