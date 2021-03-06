package com.covalense.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student_otherinfo")
public class StudentOtherInfo implements Serializable{

	@Id
	private int rollNum ;
	private String fatherName ;
	private String motherName; 
	private String religion_name;
	private String nationality; 
}
