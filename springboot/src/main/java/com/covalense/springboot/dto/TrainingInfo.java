package com.covalense.springboot.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;



@SuppressWarnings("serial")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="training-info-bean")
//@XmlAccessorType(XmlAccessType.FIELD)

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

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public List<EmpInfoBean> getInfoBeans() {
		return infoBeans;
	}

	public void setInfoBeans(List<EmpInfoBean> infoBeans) {
		this.infoBeans = infoBeans;
	}


	
}
