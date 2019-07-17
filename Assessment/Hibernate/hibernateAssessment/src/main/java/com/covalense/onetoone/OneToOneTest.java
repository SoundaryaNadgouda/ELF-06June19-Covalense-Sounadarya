package com.covalense.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernate.dto.StudentInfoBean;
import com.covalense.hibernate.util.HibernateUtil;


public class OneToOneTest {
	public static void main(String[] args) {
		int id=100;
		StudentInfoBean data=PrepareDataUtil.prepareData(id);
		save(data);
	}
	

	private static void save(StudentInfoBean data) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		 Session session=factory.openSession();
		Transaction tnx=session.beginTransaction();
		session.save(data);
		tnx.commit();
		session.close();
		
		
	
	}
	
}
