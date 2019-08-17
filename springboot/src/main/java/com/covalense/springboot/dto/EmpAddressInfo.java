package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;



@SuppressWarnings("serial")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="emp-adress-bean")
//@XmlAccessorType(XmlAccessType.FIELD)

@Entity
@Table(name="emp_address_info")
public class EmpAddressInfo implements Serializable{
	
	@EmbeddedId
	private EmpAdressPKBean pkBean;
	private String address1;
	private String address2;
	private String landmark;
	private String city;
	private String state;
	private String country;
	private Integer pincode;
	public EmpAdressPKBean getPkBean() {
		return pkBean;
	}
	public void setPkBean(EmpAdressPKBean pkBean) {
		this.pkBean = pkBean;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
	
	

}
