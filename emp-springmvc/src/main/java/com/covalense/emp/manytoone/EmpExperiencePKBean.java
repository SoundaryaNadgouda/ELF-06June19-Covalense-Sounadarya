package com.covalense.emp.manytoone;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.covalense.emp.dto.EmpInfoBean;
import com.covalense.emp.dto.EmpOtherInfoBean;


import lombok.Data;
@Data
@Embeddable

public class EmpExperiencePKBean  implements Serializable{
	
	@ManyToOne
	@JoinColumn(name="id")
	private EmpInfoBean infoBean;
	private String companyName;
}
