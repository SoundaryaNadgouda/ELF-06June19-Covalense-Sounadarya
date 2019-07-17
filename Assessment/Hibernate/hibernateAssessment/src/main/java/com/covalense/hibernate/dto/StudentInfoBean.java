package com.covalense.hibernate.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student_info")
public class StudentInfoBean implements Serializable{
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private StudentOtherInfo otherinfo;
	
	@Id
	private int rollnum ;
	private String name ;
	private int age ;
	private String gender;
	private int mobileNo;
	private String emailId ;
	

}
