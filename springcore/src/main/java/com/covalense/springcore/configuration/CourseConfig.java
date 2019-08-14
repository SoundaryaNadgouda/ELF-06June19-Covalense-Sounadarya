package com.covalense.springcore.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.CourseBean;

import lombok.extern.java.Log;

@Log
public class CourseConfig {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("course.xml");
		CourseBean bean=(CourseBean) applicationContext.getBean("courseBean");
		log.info("id is :"+bean.getCourseid());
		log.info("name is :"+bean.getCoursename());
		log.info("faculty is :"+bean.getFaculty());
	

	}

}
