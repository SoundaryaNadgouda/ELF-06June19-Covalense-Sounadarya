package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import com.covalense.hibernateapp.dto.EmpInfoBean;
import com.covalense.hybernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetDetailsProjection {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmpInfoBean.class);
		Projection projection = Projections.property("name");
		Projection projectionOne = Projections.property("id");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(projection);
		projectionList.add(projectionOne);
		criteria.setProjection(projectionList);
		List<Object[]> emp = criteria.list();
		for (Object[] o : emp) {
			log.info("Name are " + o[0]);
			log.info("ids are " + o[1]);
		}

	}

}
