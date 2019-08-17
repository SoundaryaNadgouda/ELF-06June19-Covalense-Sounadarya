package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;


@SuppressWarnings("serial")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="emp-otherinfo-bean")
//@XmlAccessorType(XmlAccessType.FIELD)

@Entity
@Table(name="emp_other_info")

public class EmpOtherInfoBean implements Serializable{		
	
	//@XmlTransient
	@JsonIgnore
	@Id
	@OneToOne
	@JoinColumn(name="id")
	//@PrimaryKeyJoinColumn(name="id")
	private EmpInfoBean infoBean;
 		
   private Long pan;					
   private	Boolean is_married	;			
   private String blood_group	;				
   private Boolean is_challenged	;			
   private Long emergency_contact_number	;	
   private String nationality	;				
   private String religion	;					
   private String father_name	;				
   private String mother_name	;			
   private String spouse_name;				
   private Long passport;					
   private Long aadhar	;
public EmpInfoBean getInfoBean() {
	return infoBean;
}
public void setInfoBean(EmpInfoBean infoBean) {
	this.infoBean = infoBean;
}
public Long getPan() {
	return pan;
}
public void setPan(Long pan) {
	this.pan = pan;
}
public Boolean getIs_married() {
	return is_married;
}
public void setIs_married(Boolean is_married) {
	this.is_married = is_married;
}
public String getBlood_group() {
	return blood_group;
}
public void setBlood_group(String blood_group) {
	this.blood_group = blood_group;
}
public Boolean getIs_challenged() {
	return is_challenged;
}
public void setIs_challenged(Boolean is_challenged) {
	this.is_challenged = is_challenged;
}
public Long getEmergency_contact_number() {
	return emergency_contact_number;
}
public void setEmergency_contact_number(Long emergency_contact_number) {
	this.emergency_contact_number = emergency_contact_number;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public String getReligion() {
	return religion;
}
public void setReligion(String religion) {
	this.religion = religion;
}
public String getFather_name() {
	return father_name;
}
public void setFather_name(String father_name) {
	this.father_name = father_name;
}
public String getMother_name() {
	return mother_name;
}
public void setMother_name(String mother_name) {
	this.mother_name = mother_name;
}
public String getSpouse_name() {
	return spouse_name;
}
public void setSpouse_name(String spouse_name) {
	this.spouse_name = spouse_name;
}
public Long getPassport() {
	return passport;
}
public void setPassport(Long passport) {
	this.passport = passport;
}
public Long getAadhar() {
	return aadhar;
}
public void setAadhar(Long aadhar) {
	this.aadhar = aadhar;
}




}
