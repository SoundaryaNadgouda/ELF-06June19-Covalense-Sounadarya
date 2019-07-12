package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.covalense.hybernateapp.util.HibernateUtil;
import lombok.extern.java.Log;

@Log

public class ReadDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		 String hql="update from EmpInfoBean  set name=' "+args[0]+" ' where id="+Integer.parseInt(args[1])+" "; 
		 Query query=session.createQuery(hql);
		/*
		 * query.setParameter("empname",args[0]); query.setParameter("empid",args[1]);
		 */
		 Transaction transaction=null;
		 try {
		 transaction=session.beginTransaction();
		 int result=query.executeUpdate();
		  log.info("Updated="+result);
		  transaction.commit();
		 }catch(Exception e) {
			 transaction.rollback();
			 log.info(" "+e);
		 }finally {
		  session.close();
		 }
		
		/*
		 * String hql="from EmpInfoBean"; Query query=session.createQuery(hql);
		 * List<EmpInfoBean> empInfoBeans=query.list(); for(EmpInfoBean
		 * empInfoBean:empInfoBeans) { log.info("Id="+empInfoBean.getId());
		 * log.info("Name="+empInfoBean.getName());
		 * log.info("Age="+empInfoBean.getAge()); log.info("Dob="+empInfoBean.getDob());
		 * log.info("Gender="+empInfoBean.getGender());
		 * log.info("Designation="+empInfoBean.getDesignation());
		 * log.info("Email="+empInfoBean.getEmail());
		 * log.info("Acno="+empInfoBean.getAcno());
		 * log.info("DeptId="+empInfoBean.getDeptid());
		 * log.info("managerId="+empInfoBean.getManagerid());
		 * log.info("phone="+empInfoBean.getPhone());
		 * log.info("Salary="+empInfoBean.getSalary());
		 * log.info("Joiningdate="+empInfoBean.getJoiningDate()); }
		 */
	}

}
