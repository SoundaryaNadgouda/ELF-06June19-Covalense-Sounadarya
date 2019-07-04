package com.covalense.xmlexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.covalense.xmlexample.dto.DepartmentInfoBean;

public class SaveDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
//		cfg.addAnnotatedClass(EmpInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		DepartmentInfoBean deptInf=new DepartmentInfoBean();
		deptInf.setDeptid(17);
		deptInf.setDeptname("mech");
		

		Transaction transaction=session.beginTransaction(); 
		session.saveOrUpdate(deptInf);
		 transaction.commit();
		 session.close();
		

	}

}
