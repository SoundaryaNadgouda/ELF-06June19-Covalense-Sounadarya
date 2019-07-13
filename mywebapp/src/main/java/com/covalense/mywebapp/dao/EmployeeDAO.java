package com.covalense.mywebapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.covalense.mywebapp.beans.EmpInfoBean;

public interface EmployeeDAO {
	List<EmpInfoBean> getAllEmployeeInfo();
	 EmpInfoBean getEmployeeInfo(String id);
	 EmpInfoBean getEmployeeInfo(int id);
	 boolean createEmpInfo(EmpInfoBean bean);
	 boolean updateEmpInfo(EmpInfoBean bean);
	 boolean deleteEmpInfo(int id);
	 boolean createEmpInfo(String id);
}
