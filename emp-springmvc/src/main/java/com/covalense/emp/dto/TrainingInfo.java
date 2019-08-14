package com.covalense.emp.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name="training_info")
public class TrainingInfo implements Serializable{
	@Id
	private Integer courseId;
	private String courseName;
	private String courseType;
	private Integer duration;
	
@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="emp_training_info",
	joinColumns= {@JoinColumn(name="courseId")},
	inverseJoinColumns= @JoinColumn(name="id"))
	List<EmpInfoBean> infoBeans;
	
	
	
}
