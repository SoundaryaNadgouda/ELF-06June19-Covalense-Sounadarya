package com.covalense.designpattern.dao;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpattern.beans.EmpInfoBean;


public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	public ArrayList<EmpInfoBean
	> getAllEmployeeInfo() {
		// To Do
		return null;
	}

	public EmpInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	public EmpInfoBean getEmployeeInfo(int id) {
		//1.load config file
		Configuration cfg = new Configuration();
		cfg.configure();
		/*
		 * try { cfg.configure(new URL(
		 * "https://github.com/SoundaryaNadgouda/ELF-06June19-Covalense-Sounadarya/blob/master/hibernate.cfg.xml"
		 * )); } catch (HibernateException e) { e.printStackTrace(); } catch
		 * (MalformedURLException e) { e.printStackTrace(); }
		 */
		//2.build the session
		SessionFactory factory = cfg.buildSessionFactory();
		//3.open session
		Session session = factory.openSession();
		//4.interact with db via session
		EmpInfoBean bean = session.get(EmpInfoBean.class, id);
		//5.close the session
		session.close();
		return bean;

	}

	public boolean createEmpInfo(EmpInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateEmpInfo(EmpInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteEmpInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createEmpInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
