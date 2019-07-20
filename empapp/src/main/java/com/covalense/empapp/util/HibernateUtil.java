package com.covalense.empapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.empapp.beans.EmpInfoBean;


public class HibernateUtil {
   private static SessionFactory factory=null;
	public static SessionFactory buildSessionFactory() {
		
		return new Configuration().configure().addAnnotatedClass(EmpInfoBean.class).buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		if(factory==null) {
			factory=buildSessionFactory();
		}
		return factory;
	}
	public static Session openSession() {
		return getSessionFactory().openSession();
	}
}
