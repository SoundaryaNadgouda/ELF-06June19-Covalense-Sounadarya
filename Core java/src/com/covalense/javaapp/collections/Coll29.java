package com.covalense.javaapp.collections;

import java.util.ArrayList;
import lombok.extern.java.Log;
@Log
public class Coll29 {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		Student s1=new Student();
		s1.name="abc";
		s1.id=2;
		s1.percentage=67.5;
		
		Student s2=new Student();
		s2.name="xyz";
		s2.id=3;
		s2.percentage=77.5;
		
		Student s3=new Student();
		s3.name="mno";
		s3.id=3;
		s3.percentage=87.5;
		
		Student s4=new Student();
		s4.name="pqr";
		s4.id=4;
		s4.percentage=97.5;
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		for(Student s:al){
			log.info(" "+s);
		}
	}

}
