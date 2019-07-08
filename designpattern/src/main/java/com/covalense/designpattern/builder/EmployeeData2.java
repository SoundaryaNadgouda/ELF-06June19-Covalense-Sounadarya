package com.covalense.designpattern.builder;

import java.util.Date;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public final class EmployeeData2 {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joiningDate;
	private long acno;
	private String email;
	private String designation;
	private Date dob;
	private int deptid;
	private int managerid;
	
	private EmployeeData2(EmployeeData2Builder builder) {
		id=builder.id;
		name=builder. name;
		age=builder.age;
		gender=builder.gender;
		salary=builder.salary;
		phone=builder.phone;
		joiningDate=builder.joiningDate;
		acno=builder.acno;
		email=builder.email;
		designation=builder.designation;
		dob=builder.dob;
		deptid=builder.deptid;
		managerid=builder.managerid;
		
	}
	
	public static class EmployeeData2Builder{
		private int id;
		private String name;
		private int age;
		private String gender;
		private double salary;
		private long phone;
		private Date joiningDate;
		private long acno;
		private String email;
		private String designation;
		private Date dob;
		private int deptid;
		private int managerid;
		
	
		
		public  EmployeeData2Builder id(int id) {
			this.id=id;
			return this;
		}
		public  EmployeeData2Builder name(String name) {
			this.name=name;
			return this;
		}
		public  EmployeeData2Builder age( int age) {
			this.age=age;
			return this;
		}
		public  EmployeeData2Builder gender( String gender) {
			this.gender=gender;
			return this;
		}
		public  EmployeeData2Builder salary( double salary) {
			this.salary=salary;
			return this;
		}
		public  EmployeeData2Builder phone(  long phone) {
			this.phone=phone;
			return this;
		}
		public  EmployeeData2Builder joiningDate( Date joiningDate) {
			this. joiningDate= joiningDate;
			return this;
		}
		public  EmployeeData2Builder acno(  long acno) {
			this.acno=acno;
			return this;
		}
		public  EmployeeData2Builder email(  String email) {
			this.email=email;
			return this;
		}
		public  EmployeeData2Builder designation( String designation) {
			this.designation=designation;
			return this;
		}
		public  EmployeeData2Builder dob(  Date dob) {
			this.dob=dob;
			return this;
		}
		public  EmployeeData2Builder deptid( int deptid) {
			this.deptid=deptid;
			return this;
		}
		public  EmployeeData2Builder managerid(  int managerid) {
			this.managerid=managerid;
			return this;
		}
		
		public EmployeeData2 build() {
		return new EmployeeData2(this);
		}
		
	}

}
