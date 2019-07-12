package com.covalense.hibernateapp.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hybernateapp.util.HibernateUtil;

public class HibernateForAws {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/covalense/hibernateapp/awsrds/hibernate.aws.cfg.xml");
		cfg.addAnnotatedClass(EmpNewInfo.class);
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
	}
	
}
