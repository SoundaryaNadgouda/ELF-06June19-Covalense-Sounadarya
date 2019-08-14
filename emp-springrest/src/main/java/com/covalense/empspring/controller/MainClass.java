package com.covalense.empspring.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.empspring.dao.EmployeeDAOHibernateImpl;
import com.covalense.empspring.dto.DepartmentInfoBean;
import com.covalense.empspring.dto.EmpAddressInfo;
import com.covalense.empspring.dto.EmpEducationInfo;
import com.covalense.empspring.dto.EmpExperienceInfo;
import com.covalense.empspring.dto.EmpInfoBean;
import com.covalense.empspring.dto.EmpOtherInfoBean;
import com.covalense.empspring.dto.TrainingInfo;

public class MainClass {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		SessionFactory factory = configuration.configure()
				.addAnnotatedClass(EmpInfoBean.class)
				.addAnnotatedClass(EmpAddressInfo.class)
				.addAnnotatedClass(EmpEducationInfo.class)
				.addAnnotatedClass(EmpExperienceInfo.class)
				.addAnnotatedClass(EmpOtherInfoBean.class)
				.addAnnotatedClass(DepartmentInfoBean.class)
				.addAnnotatedClass(TrainingInfo.class).buildSessionFactory();
		System.out.println("Getting emp info bean");
		Session session = factory.openSession();
		EmpInfoBean bean = session.get(EmpInfoBean.class, 6);
		session.beginTransaction();
		session.delete(bean);
		session.getTransaction().commit();
		System.out.println("Deleted emp info");
	}
}
