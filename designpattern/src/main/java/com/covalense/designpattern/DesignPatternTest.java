package com.covalense.designpattern;

import com.covalense.designpattern.beans.EmpInfoBean;
import com.covalense.designpattern.dao.EmployeeDAO;
import com.covalense.designpattern.dao.EmployeeDAOFactory;
import lombok.extern.java.Log;

@Log

public class DesignPatternTest {
	public static void main(String[] args) {
//		EmployeeDAO dao = new EmployeeDAOJDBCImpl();
//		EmployeeDAO dao = new EmployeeDAOHibernateImpl();
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		printInfo(dao.getEmployeeInfo(1));
		printInfo(dao.getEmployeeInfo("2"));

		/*
		 * ArrayList<EmpInfoBean> beans = dao.getAllEmployeeInfo(); for (EmpInfoBean
		 * bean : beans) { printInfo(bean); }
		 */

		// create an EmployeeInfo
		EmpInfoBean empInf = new EmpInfoBean();
		empInf.setId(30);
		empInf.setName("nadgouda");
		empInf.setAge(20);
		empInf.setSalary(50500);
		empInf.setPhone(460232);
		empInf.setAcno(64579495);
		empInf.setGender("male");
		empInf.setDeptid(22);
		empInf.setDesignation("pilot");
		empInf.setEmail("manoj@gmail.com");
		empInf.setManagerid(112);
		//log.info(" "+dao.createEmpInfo(empInf));
	log.info(" "+dao.deleteEmpInfo(8));	
	}

	private static void printInfo(EmpInfoBean bean) {
		log.info(bean.getDesignation());
		log.info(bean.getEmail());
		log.info(bean.getGender());
		log.info(bean.getName());
		log.info(" " + bean.getAcno());
		log.info(" " + bean.getAge());
		log.info(" " + bean.getDeptid());
		log.info(" " + bean.getDob());
		log.info(" " + bean.getId());
		log.info(" " + bean.getJoiningDate());
		log.info(" " + bean.getManagerid());
		log.info(" " + bean.getPhone());
		log.info(" " + bean.getSalary());

	}
}
