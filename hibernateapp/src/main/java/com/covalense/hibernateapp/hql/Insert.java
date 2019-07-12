package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.covalense.hybernateapp.util.HibernateUtil;
import lombok.extern.java.Log;

@Log
public class Insert {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		 String hql="insert into EmpNewInfo(id,name,email) select id,name,email from EmpInfoBean where id=1"; 
		 Transaction transaction=null;
		 try {
		 transaction=session.beginTransaction();
		 Query query=session.createQuery(hql);
		 int result=query.executeUpdate();
		  log.info("Result="+result);
		  transaction.commit();
		 }catch(Exception e) {
			 transaction.rollback();
			 log.info(" "+e);
		 }finally {
		  session.close();

	}
	}
}
