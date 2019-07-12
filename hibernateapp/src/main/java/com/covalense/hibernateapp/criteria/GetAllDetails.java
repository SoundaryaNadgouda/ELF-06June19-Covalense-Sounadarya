package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.covalense.hibernateapp.dto.EmpInfoBean;
import com.covalense.hybernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetAllDetails {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmpInfoBean.class);
		List<EmpInfoBean> emp = criteria.list();
		for (EmpInfoBean empInfoBean : emp) {
			log.info("Id=" + empInfoBean.getId());
			log.info("Name=" + empInfoBean.getName());
			log.info("Age=" + empInfoBean.getAge());
			log.info("Dob=" + empInfoBean.getDob());
			log.info("Gender=" + empInfoBean.getGender());
			log.info("Designation=" + empInfoBean.getDesignation());
			log.info("Email=" + empInfoBean.getEmail());
			log.info("Acno=" + empInfoBean.getAcno());
			log.info("DeptId=" + empInfoBean.getDeptid());
			log.info("managerId=" + empInfoBean.getManagerid());
			log.info("phone=" + empInfoBean.getPhone());
			log.info("Salary=" + empInfoBean.getSalary());
			log.info("Joiningdate=" + empInfoBean.getJoiningDate());
		}

	}

}
