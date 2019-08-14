package com.covalense.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.java.Log;
@Log
public class EmpInfoBean implements InitializingBean,DisposableBean{
 private String name;
 private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Autowired
private DeptBean deptBean;

	/*
	 * public EmpInfoBean(String name, int id, DeptBean deptBean) { super();
	 * this.name = name; this.id = id; this.deptBean = deptBean; }
	 */
public DeptBean getDeptBean() {
	return deptBean;
}
public void setDeptBean(DeptBean deptBean) {
	this.deptBean = deptBean;
}
@Override
public void afterPropertiesSet() throws Exception {
	log.info("start");
	
}
@Override
public void destroy() throws Exception {
	log.info("end");
	
}
}
