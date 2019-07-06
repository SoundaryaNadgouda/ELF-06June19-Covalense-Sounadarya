package com.covalense.designpattern.dao;

import java.util.ArrayList;

import com.covalense.designpattern.beans.EmpInfoBean;

public interface EmployeeDAO {
	ArrayList<EmpInfoBean> getAllEmployeeInfo();
	 EmpInfoBean getEmployeeInfo(String id);
	 EmpInfoBean getEmployeeInfo(int id);
	 boolean createEmpInfo(EmpInfoBean bean);
	 boolean updateEmpInfo(EmpInfoBean bean);
	 boolean deleteEmpInfo(int id);
	 boolean createEmpInfo(String id);
}
