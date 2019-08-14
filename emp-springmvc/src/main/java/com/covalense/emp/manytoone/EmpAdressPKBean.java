package com.covalense.emp.manytoone;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.covalense.emp.dto.EmpInfoBean;

import lombok.Data;

@Data
@Embeddable
public class EmpAdressPKBean implements Serializable{

@ManyToOne
	@JoinColumn(name="id")
	private EmpInfoBean infoBean;
	private String addressType;
}
