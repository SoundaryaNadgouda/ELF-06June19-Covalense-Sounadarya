package com.covalense.criteria;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class CustomerTest {
	public static void main(String[] args) {
		
	Configuration configuration=new Configuration();
	configuration.addAnnotatedClass(CustomerBean.class);
	
	SessionFactory factory=configuration.buildSessionFactory();
	 Session session=factory.openSession();
	 String hql="insert into Test(firstName,lastName,cityname) select firstName,lastName,cityname from CustomerBean where id=10";
	Query query= session.createQuery(hql);
	int result=query.executeUpdate();
	log.info("result :"+result );
	Transaction txn=session.beginTransaction();
	session.save(query);
	session.close();
	
	
	
	
	}
	 
	 
	 
	
}
