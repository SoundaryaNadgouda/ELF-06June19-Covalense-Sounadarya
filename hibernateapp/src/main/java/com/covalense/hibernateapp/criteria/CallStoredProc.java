package com.covalense.hibernateapp.criteria;

import java.util.List;
import javax.persistence.StoredProcedureQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.covalense.hibernateapp.dto.EmpInfoBean;
import com.covalense.hybernateapp.util.HibernateUtil;
import lombok.extern.java.Log;
@Log
public class CallStoredProc {
	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		StoredProcedureQuery query=session.createStoredProcedureCall("s1",EmpInfoBean.class);
		List<EmpInfoBean>emp	=query.getResultList();
		for(EmpInfoBean empInfoBean:emp) {
			log.info("Name are "+empInfoBean.getAge());
			 log.info("ids are "+empInfoBean.getName());
	}
	}
}
