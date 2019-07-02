package com.covalense.javaapp.collections;

import java.util.TreeSet;
import lombok.extern.java.Log;
@Log
public class CollThirtyFour {

	public static void main(String[] args) {
		EmployeeByName r2=new EmployeeByName();
		TreeSet<Employee> t=new TreeSet<>(r2);
		Employee e1=new Employee();
		e1.name="Soundarya";
		e1.id=5;
		e1.sal=20000;
		
		Employee e2=new Employee();
		e2.name="Soujanya";
		e2.id=3;
		e2.sal=30000;
		
		Employee e3=new Employee();
		e3.name="Shivani";
		e3.id=1;
		e3.sal=10000;
		
		Employee e4=new Employee();
		e4.name="Shivu";
		e4.id=2;
		e4.sal=50000;
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		
		
		for(Employee e:t) {
			log.info("Name is "+e.name);
			log.info("Id is "+e.id);
			log.info("Sal is "+e.sal);
			
	}
	}
}
