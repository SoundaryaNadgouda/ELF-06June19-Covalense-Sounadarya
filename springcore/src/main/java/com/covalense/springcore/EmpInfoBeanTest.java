
package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmpInfoBean;

import lombok.extern.java.Log;
@Log
public class EmpInfoBeanTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("importAll.xml");
		EmpInfoBean infoBean1=(EmpInfoBean)applicationContext.getBean("employee");
		
	
	
		log.info("name is :"+infoBean1.getName());
		log.info("name is :"+infoBean1.getId());
	
		log.info("name is :"+infoBean1.getDeptBean().getDeptName());
		log.info("name is :"+infoBean1.getDeptBean().getDeptId());
	
		((AbstractApplicationContext)applicationContext).close();
		
		
		
		

	}

}
