package com.covalense.emp.dto;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.covalense.emp.manytoone.EmpAdressPKBean;

import lombok.Data;


@Data
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
	
	
	

}
