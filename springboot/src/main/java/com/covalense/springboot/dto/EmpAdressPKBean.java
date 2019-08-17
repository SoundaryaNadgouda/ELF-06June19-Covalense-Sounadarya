package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;



@SuppressWarnings("serial")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="emp-adresspk-bean")
//@XmlAccessorType(XmlAccessType.FIELD)

@Embeddable
public class EmpAdressPKBean implements Serializable{

	//@XmlTransient
	@JsonIgnore
@ManyToOne
	@JoinColumn(name="id")
	private EmpInfoBean infoBean;
	private String addressType;
	public EmpInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmpInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
	
}
