package com.covalense.empapp.dao;

public class EmployeeDAOFactory {
	public  EmployeeDAOFactory() {}
	private static String dbInteractionType="hibernate";
	public static EmployeeDAO getInstance() {
		EmployeeDAO dao=null;
		if(dbInteractionType.equals("jdbc")) {
			dao=new EmployeeDAOJDBCImpl();
		}else if(dbInteractionType.equals("hibernate")) {
			dao=new EmployeeDAOHibernateImpl();
		}
		return dao;
	}
}
