package com.covalense.empspring.dto;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;


@SuppressWarnings("serial")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="emp-adress-bean")
//@XmlAccessorType(XmlAccessType.FIELD)
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
