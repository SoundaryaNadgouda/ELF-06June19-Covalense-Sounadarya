package com.covalense.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.config.HibernateConfig;

import lombok.extern.java.Log;
@Log
public class GetItems {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		ItemBean bean=session.get(ItemBean.class,103);
		log.info("Id is :"+bean.getItem_id());
		log.info("Id is :"+bean.getItem_name());
		log.info("Id is :"+bean.getDescription());
		log.info("Id is :"+bean.getCost());
		log.info("Id is :"+bean.getQuantity());

	}

}
