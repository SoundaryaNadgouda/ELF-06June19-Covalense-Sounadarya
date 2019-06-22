package com.covalense.javaapp.collections;

public class Student implements Comparable<Student>{
	String name;
	int id;
	double percentage;
	
	
	public int compareTo(Student s) {
		String a=this.name;
		String b=s.name;
		
		int k=a.compareTo(b);
				return k;
	}
	
	
	/*public int compareTo(Student s) {    /*logic to sort students w.r.t percentage
		if(this.percentage<s.percentage) {
			return -1;
		}
		else if(this.percentage>s.percentage) {
			return 1;
		}
		else {
			return 0;
		*/
	/*logic to sort students w.r.t id */
	/*public int compareTo(Student s) {		
		if(this.id<s.id) {
			return -1;
		}
		else if(this.id>s.id) {
			return 1;
		}
		else {
			return 0;*/

	}	
	
	
	

