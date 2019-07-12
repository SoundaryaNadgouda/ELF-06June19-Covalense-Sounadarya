package com.covalense.hybernateapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.covalense.hibernateapp.onetoone.EmpInfoBean;
import com.covalense.hibernateapp.onetoone.EmpOtherInfoBean;

public class PreapareDataUtil  {
	private PreapareDataUtil (){}
	public static EmpInfoBean prepareData(int id) throws ParseException {
	EmpInfoBean empInf = new EmpInfoBean(); 
	SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
	 empInf.setName("nadgouda");
	 empInf.setId(id);
	 empInf.setAge(20); 
	 empInf.setSalary(50500);
	 empInf.setPhone(460232); 
	 empInf.setAcno(64579495); 
	 Date date=format.parse("1993-02-03"); empInf.setDob(date);
	  empInf.setGender("male"); 
	  empInf.setDeptid(22);
	  empInf.setDesignation("pilot");
	  empInf.setEmail("manoj@gmail.com"); 
	  Date dateOne=format.parse("2018-08-03"); 
	  empInf.setJoiningDate(dateOne);
	empInf.setManagerid(112);
	
	EmpOtherInfoBean otherInfo=new EmpOtherInfoBean();
	
	otherInfo.setAadhar(45734857l);
	otherInfo.setId(id);
	otherInfo.setBlood_group("a");
	otherInfo.setEmergency_contact_number(5666666l);
	otherInfo.setFather_name("abc");
	otherInfo.set_challenged(false);
	otherInfo.set_married(false);
	otherInfo.setMother_name("xyz");
	otherInfo.setNationality("indian");
	otherInfo.setPan(756764l);
	otherInfo.setPassport(34756347l);
	otherInfo.setReligion("hindu");
	otherInfo.setSpouse_name("mno");
	
	empInf.setOtherInfo(otherInfo);
	
	return empInf;
	}
}
