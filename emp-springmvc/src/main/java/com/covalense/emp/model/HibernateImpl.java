package com.covalense.emp.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.emp.dto.EmpAddressInfo;
import com.covalense.emp.dto.EmpEducationInfo;
import com.covalense.emp.dto.EmpExperienceInfo;
import com.covalense.emp.dto.EmpInfoBean;
import com.covalense.emp.dto.EmpOtherInfoBean;
import com.covalense.emp.dto.TrainingInfo;


public class HibernateImpl {

	private Configuration configuration = new Configuration();
	private SessionFactory factory = configuration.configure().buildSessionFactory();

	public void createEmployee(EmpInfoBean infoBean, EmpOtherInfoBean otherInfoBean,
			List<EmpAddressInfo> addressInfoBeans, List<EmpEducationInfo> educationInfo,
			List<EmpExperienceInfo> empExperienceInfos) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);
		for (EmpAddressInfo empAddressInfo : addressInfoBeans) {
			session.save(empAddressInfo);
		}
		for (EmpEducationInfo empEducationInfo : educationInfo) {
			session.save(empEducationInfo);
		}
		for (EmpExperienceInfo empExperienceInfo : empExperienceInfos) {
			session.save(empExperienceInfo);
		}
		transaction.commit();
		session.close();
	}
	public void createTrainingInfo( List<TrainingInfo> trainingInfos) {
		Session session1 = factory.openSession();
		Transaction transaction1 = session1.beginTransaction();
		for (TrainingInfo trainingInfo : trainingInfos) {
			session1.save(trainingInfo);
			
		}
		transaction1.commit();
		session1.close();
	}
	public void createEmployee( EmpInfoBean empInfoBeans) {
		Session session1 = factory.openSession();
		Transaction transaction1 = session1.beginTransaction();
			session1.save(empInfoBeans);
		transaction1.commit();
		session1.close();
	
	}
	public EmpInfoBean getEmpInfoBean(int id) {
		Session session1 = factory.openSession();
		EmpInfoBean bean=session1.get(EmpInfoBean.class, id);
		session1.close();
		return bean;
		
	}
}
