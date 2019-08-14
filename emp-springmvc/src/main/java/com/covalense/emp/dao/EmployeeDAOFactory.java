package com.covalense.emp.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {
	public  EmployeeDAOFactory() {}
	//private static String dbInteractionType="msg2";
	@Bean("jdbc")
	public  EmployeeDAO getInstance1() {
			return new EmployeeDAOJDBCImpl();
	}
	
	@Bean("hibernate")
	public  EmployeeDAO getInstance() {
			return new EmployeeDAOHibernateImpl();
	}
			
		
	
	}

