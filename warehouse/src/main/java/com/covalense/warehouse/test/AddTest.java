package com.covalense.warehouse.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.util.HibernateUtil;

public class AddTest {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Session session=context.getBean(HibernateUtil.class).openSession();
	ItemBean bean=new ItemBean();
	bean.setItem_id(107);
	bean.setItem_name("Cycle");
	bean.setDescription("LadyBird");
	bean.setCost(12000);
	bean.setQuantity(15);
	
	Transaction txn=session.beginTransaction();
	session.saveOrUpdate(bean);
	txn.commit();
	session.close();
	}

}
