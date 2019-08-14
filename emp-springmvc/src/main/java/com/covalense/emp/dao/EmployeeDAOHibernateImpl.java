package com.covalense.emp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.emp.dto.EmpInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	@Autowired
	   private  SessionFactory factory;
	
	public List<EmpInfoBean> getAllEmployeeInfo() {
		Session session = factory.openSession();
		String hql = "from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		ArrayList<EmpInfoBean> EmployeeInfoBeans = (ArrayList<EmpInfoBean>) query.list();
		return EmployeeInfoBeans;

	}

	public EmpInfoBean getEmployeeInfo1(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	public EmpInfoBean getEmployeeInfo1(int id) {

		Session session = factory.openSession();
		EmpInfoBean bean = session.get(EmpInfoBean.class, id);
		session.close();
		return bean;

	}

	private boolean saveOrUpdate(EmpInfoBean bean) {
		Transaction txn = null;
		try (Session session = factory.openSession();){
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit(); 
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	public boolean createEmpInfo(EmpInfoBean bean) {
		return saveOrUpdate(bean);
	}

	public boolean updateEmpInfo1(EmpInfoBean bean) {
		return saveOrUpdate(bean);
	}

	public boolean deleteEmpInfo(int id) {
		Transaction txn=null;
		EmpInfoBean bean=new EmpInfoBean();
		bean.setId(id);
		
		try (Session session=factory.openSession();){
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
		return deleteEmpInfo(Integer.parseInt(id));
	}
	public ArrayList<EmpInfoBean> searchEmployeeId(int id) {
		Session session = factory.openSession();
		String hql = "from EmployeeInfoBean where str(id) like '"+id+"%'";
		Query query = session.createQuery(hql);
		ArrayList<EmpInfoBean> EmployeeInfoBeans = (ArrayList<EmpInfoBean>) query.list();
		return EmployeeInfoBeans;

	}
	public ArrayList<EmpInfoBean> searchEmployeeId(String id) {
		return searchEmployeeId(Integer.parseInt(id));
	}

	public EmpInfoBean getEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	public EmpInfoBean getEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean createEmpInfo1(EmpInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmpInfo(EmpInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	/*@Override
	public EmployeeInfoBean searchEmpInfo(int id) {
	return searchEmpInfo(id);
*/
	}

