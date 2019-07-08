package com.covalense.designpattern.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) throws ParseException {
		MyImmutableClass immutableClass=new MyImmutableClass("abc", 17, 6577776767L);
		
		log.info("Name is "+immutableClass.getName());
		log.info("Age is "+immutableClass.getAge());
		log.info("Number is "+immutableClass.getPhone());
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date date=format.parse("2013-02-01");
		
		EmployeeData data=new EmployeeData(8,"abc",29,"male",56000,85766645,date,5767676,"abc@gamil.com","manager",date,15,108);
	log.info("Employee Data:"+data.toString());
	
	EmployeeData2 data2=new EmployeeData2
			.EmployeeData2Builder().
			id(9).name("xyz").age(29).acno(8675878).deptid(23).designation("hacker").dob(date).email("xyz@gamil.com").gender("female")
			.joiningDate(date).managerid(113).phone(576667576).salary(56939).build();
	log.info("Employee Data 2 : "+data2.toString());
	
	EmployeeData3 data3=new EmployeeData3
			.EmployeeData3Builder().
			id(13).name("xyz").age(29).acno(8675878).deptid(23).designation("hacker").dob(date).email("xyz@gamil.com").gender("female")
			.joiningDate(date).managerid(113).phone(576667576).salary(56939).build();
	log.info("Employee Data 3 : "+data3.toString());
	
	}

}
