package com.covalense.empspring.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@SuppressWarnings("serial")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="training-info-bean")
//@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Entity
@Table(name="training_info")
public class TrainingInfo implements Serializable{
	@Id
	private Integer courseId;
	private String courseName;
	private String courseType;
	private Integer duration;
	
	//@XmlTransient
	@JsonIgnore
@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="emp_training_info",
	joinColumns= {@JoinColumn(name="courseId")},
	inverseJoinColumns= @JoinColumn(name="id"))
	List<EmpInfoBean> infoBeans;


	
}
