package com.covalense.hibernateapp.onetoone;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hybernateapp.util.HibernateUtil;
import com.covalense.hybernateapp.util.PreapareDataUtil;

import lombok.extern.java.Log;
@Log
public class HibernateOneToOneTest {

	public static void main(String[] args) throws ParseException  {
		int id =100;
		EmpInfoBean data=PreapareDataUtil.prepareData(id);
		save(data);
		}
	private static void save(EmpInfoBean data)  throws ParseException{
		Transaction txn=null;
		try(Session session=HibernateUtil.buildSessionFactory().openSession();)
				{
			 txn=session.beginTransaction();
			session.save(data);
			txn.commit();
		}catch(Exception e) {
			//log.info(Arrays.toString(e.getStackTrace()));
			e.printStackTrace();
			if(txn!=null) {
				txn.rollback();
			}
		}
		
			
		}
		
}
