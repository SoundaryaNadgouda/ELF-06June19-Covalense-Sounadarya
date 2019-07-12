package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTestTwo {

	public static void main(String[] args) {
		log.info("1st time "+getEmployeeData(1).toString());
		log.info("2nd time "+getEmployeeData(1).toString());
		log.info("3rd time "+getEmployeeData(1).toString());
	}
	private static EmpNewInfo getEmployeeData(int id) {
		EmpNewInfo bean;
		try(Session session=HibernateCacheUtil.openSession();){
			 bean=session.get(EmpNewInfo.class, id);
		}
		return bean;
	}

}
