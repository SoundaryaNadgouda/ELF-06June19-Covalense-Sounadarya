package com.covalense.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.config.HibernateConfig;

public class UpdateItems {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		ItemBean bean=session.get(ItemBean.class,103);
		bean.setItem_name("Pen");
		Transaction txn=session.beginTransaction();
		session.saveOrUpdate(bean);
		txn.commit();
		session.close();
	
		
	}

}
