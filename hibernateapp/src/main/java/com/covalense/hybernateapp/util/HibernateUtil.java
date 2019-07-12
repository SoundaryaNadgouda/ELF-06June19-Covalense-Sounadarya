package com.covalense.hybernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.onetoone.EmpInfoBean;
import com.covalense.hibernateapp.onetoone.EmpOtherInfoBean;

public class HibernateUtil {
   private static SessionFactory factory=null;
	public static SessionFactory buildSessionFactory() {
		
		return new Configuration().configure().addAnnotatedClass(EmpInfoBean.class).addAnnotatedClass(EmpOtherInfoBean.class).buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		if(factory==null) {
			factory=buildSessionFactory();
		}
		return factory;
	}
}
