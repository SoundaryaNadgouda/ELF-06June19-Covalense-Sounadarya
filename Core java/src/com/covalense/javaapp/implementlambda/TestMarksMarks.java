package com.covalense.javaapp.implementlambda;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;
@Log
public class TestMarksMarks {
        static Comparator<Student> c=(i,j)->{
        	if(i.marks>j.marks) {
        		return 1;
        	}else if(i.marks<j.marks) {
        			return -1;
        		}else {
        			return 0;
        		}
        	};
        	public static  Student getTopper(ArrayList<Student> al) {
        	return al.stream().max(c).get();	
	}	
        	public static  Student getPapper(ArrayList<Student> al) {	
        		return al.stream().min(c).get();	
        	}
        	
		public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		
		Student s1=new Student("anjali",50);
		Student s2=new Student("geetha",30);
		Student s3=new Student("savitha",90);
		Student s4=new Student("megha",20);
		Student s5=new Student("deepa",80);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		
		Student s=getTopper(al);
		Student st=getPapper(al);
		
		log.info("name is "+s.name + " "+ "marks is "+ s.marks);
		log.info("name is "+st.name + " "+ "marks is "+ st.marks);
		
		
		
	}
	}


