package com.covalense.javaapp.collections;

import java.util.TreeSet;
import lombok.extern.java.Log;
@Log
public class Coll31 {

	public static void main(String[] args) {
		TreeSet<Student> t=new TreeSet<>();
		Student s1=new Student();
		s1.name="abc";
		s1.id=2;
		s1.percentage=67.5;
		
		Student s2=new Student();
		s2.name="xyz";
		s2.id=5;
		s2.percentage=77.5;
		
		Student s3=new Student();
		s3.name="mno";
		s3.id=3;
		s3.percentage=87.5;
		
		Student s4=new Student();
		s4.name="pqr";
		s4.id=1;
		s4.percentage=97.5;
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		
		
		
		for(Student s:t) {
			log.info("name is "+s.name);
		   log.info("id is "+s.id);
			log.info("percentage is "+s.percentage);
			
			
		}
	}

}
