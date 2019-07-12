package com.covalense.hibernateapp.criteria;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.covalense.hibernateapp.dto.EmpInfoBean;
import com.covalense.hybernateapp.util.HibernateUtil;
import lombok.extern.java.Log;
@Log
public class GetDetailsRestriction {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmpInfoBean.class).add(Restrictions.gt("salary", 100.00));
		/*
		 * Criterion cr=Restrictions.eq("id", 4); criteria.add(cr);
		 */
		List<EmpInfoBean> emp = criteria.list();
		for (EmpInfoBean empInfoBean : emp) {

			log.info("Name is " + empInfoBean.getSalary());
		}
	}
}