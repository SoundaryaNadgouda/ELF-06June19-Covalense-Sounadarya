package com.covalense.hibernateapp.onetoone;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="emp_other_info")
@Data
public class EmpOtherInfoBean implements Serializable{		
	@Id
   private  int id;		
   private long pan;					
   private	boolean is_married	;			
   private String blood_group	;				
   private boolean is_challenged	;			
   private Long emergency_contact_number	;	
   private String nationality	;				
   private String religion	;					
   private String father_name	;				
   private String mother_name	;			
   private String spouse_name;				
   private Long passport;					
   private Long aadhar	;				





}
