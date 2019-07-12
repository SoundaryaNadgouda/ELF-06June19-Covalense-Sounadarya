package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import lombok.extern.java.Log;
@Log
public class HibernateCacheTest {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(EmpNewInfo.class);
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		EmpNewInfo bean1=session.get(EmpNewInfo.class, 1);
		log.info("1st time "+bean1.toString());
		
		EmpNewInfo bean2=session.get(EmpNewInfo.class, 1);
		log.info("2nd time "+bean2.toString());
		
		EmpNewInfo bean3=session.get(EmpNewInfo.class, 1);
		log.info("3rd time "+bean3.toString());
		session.close();

	}

}
