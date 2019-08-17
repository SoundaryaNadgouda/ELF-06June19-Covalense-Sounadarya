package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;


@SuppressWarnings("serial")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="emp-experiencepk-bean")
//@XmlAccessorType(XmlAccessType.FIELD)

@Embeddable

public class EmpExperiencePKBean  implements Serializable{
	
	//@XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id")
	private EmpInfoBean infoBean;
	private String companyName;
	public EmpInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmpInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
}
