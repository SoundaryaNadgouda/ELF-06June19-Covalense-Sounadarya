package com.covalense.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.dto.StudentInfoBean;
import com.covalense.hibernate.dto.StudentOtherInfo;


public class HibernateUtil {
	
	private static SessionFactory factory;
	public static SessionFactory buildSessionFactory() {
		return new Configuration().configure().addAnnotatedClass(StudentInfoBean.class).addAnnotatedClass(StudentOtherInfo.class).buildSessionFactory();
	}
public static SessionFactory getSessionFactory() {
	if(factory==null) {
		 factory=buildSessionFactory();
	}
	return factory;
	
}
}

