package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.covalense.springcore.beans.DeptBean;
import com.covalense.springcore.beans.EmpInfoBean;
import com.covalense.springcore.configuration.EmpConfig;
import com.covalense.springcore.configuration.EmployeeConfig;

import lombok.extern.java.Log;
@Log
public class EmpConfigTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmpInfoBean infoBean=applicationContext.getBean(EmpInfoBean.class);
		
		log.info("Ename is "+infoBean.getName());
		log.info("Eid is "+infoBean.getId());
		
		DeptBean deptBean=infoBean.getDeptBean();
		
		log.info("Dept name "+deptBean.getDeptName());
		log.info("Dept id "+deptBean.getDeptId());
		
((AbstractApplicationContext)applicationContext).close();
	}

}
