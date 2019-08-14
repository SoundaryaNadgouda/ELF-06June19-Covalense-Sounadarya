package com.covalense.empspring.dao;

import java.util.ArrayList;
import java.util.List;

import com.covalense.empspring.dto.EmpInfoBean;




public interface EmployeeDAO {
	List<EmpInfoBean> getAllEmployeeInfo();
	 EmpInfoBean getEmployeeInfo1(String id);
	EmpInfoBean getEmployeeInfo1(int id);
	 boolean createEmpInfo(EmpInfoBean bean);
	 boolean updateEmpInfo1(EmpInfoBean bean);
	 boolean deleteEmpInfo(int id);
	 boolean createEmpInfo(String id);
	 ArrayList<EmpInfoBean> searchEmployeeId(int id);

}
