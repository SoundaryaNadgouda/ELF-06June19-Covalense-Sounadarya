package com.covalense.designpattern.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.designpattern.beans.EmpInfoBean;
import com.covalense.designpattern.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class EmployeeDAOHibernateImpl2 implements EmployeeDAO {
	public ArrayList<EmpInfoBean> getAllEmployeeInfo() {
		Session session = HibernateUtil.openSession();
		 String hql="from EmpInfoBean"; 
		Query query=session.createQuery(hql);
		 ArrayList<EmpInfoBean> empInfoBeans=(ArrayList<EmpInfoBean>) query.list();
		return empInfoBeans;

	
	}
	public EmpInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}
	public EmpInfoBean getEmployeeInfo(int id) {
		
		Session session = HibernateUtil.openSession();
		EmpInfoBean bean = session.get(EmpInfoBean.class, id);
		session.close();
		return bean;

	}
	private boolean saveOrUpdate(EmpInfoBean bean) {
		Transaction txn=null;
		try {
			Session session=HibernateUtil.openSession();
			txn=session.beginTransaction();
			txn.commit();
			return true;
		}catch(Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}
	public boolean createEmpInfo(EmpInfoBean bean) {
		return saveOrUpdate(bean);
	}
	public boolean updateEmpInfo(EmpInfoBean bean) {
		return saveOrUpdate(bean);
	}
	public boolean deleteEmpInfo(int id) {
		Transaction txn=null;
		EmpInfoBean bean=new EmpInfoBean();
		bean.setId(id);
		try {
			Session session=HibernateUtil.openSession();
			txn=session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		}catch(Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean createEmpInfo(String id) {
	return	deleteEmpInfo(Integer.parseInt(id));
	}

}
