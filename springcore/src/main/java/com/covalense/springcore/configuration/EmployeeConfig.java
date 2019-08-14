package com.covalense.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.covalense.springcore.beans.EmpInfoBean;

@Configuration
@Import(DeptConfig.class)
public class EmployeeConfig {

	@Bean
	public EmpInfoBean getEmpInfoBean() {
		EmpInfoBean empInfoBean=new EmpInfoBean();
		empInfoBean.setName("soundarya");
		empInfoBean.setId(1);
		return empInfoBean;
	}
	
	/*
	 * @Bean public DeptBean getDeptBean() { DeptBean deptBean=new DeptBean();
	 * deptBean.setDeptName("Cse"); deptBean.setDeptId(11); return deptBean; }
	 */
}
