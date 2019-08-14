package com.covalense.empspring.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
@SuppressWarnings("serial")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property = "id")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="emp-info-bean")
//@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Entity
@Table(name = "empinfo")

public class EmpInfoBean implements Serializable {

	@JsonProperty(value="other-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "infoBean")
	protected EmpOtherInfoBean empOtherInfoBean;
	
	@JsonProperty(value="adress-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "pkBean.infoBean")
	protected List<EmpAddressInfo> adressInfoBean;
	
	@JsonProperty(value="education-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "educationPKBean.infoBean")
	protected List<EmpEducationInfo> educationInfoBean;
	
	@JsonProperty(value="experience-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "experiencePKBean.infoBean")
	protected List<EmpExperienceInfo> experienceInfoBean;
	
	@JsonProperty(value="training-info")
	@LazyCollection(LazyCollectionOption.FALSE)
@ManyToMany(cascade = CascadeType.ALL,mappedBy = "infoBeans")
	protected List<TrainingInfo> trainingInfoBean;
	

	@Id
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private Double salary;
	private Long phone;
	private Date joiningDate;
	private long acno;
	private String email;
	private String designation;
	private Date dob;
	private String password;
	
	@JsonProperty(value="department-info")
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="deptid",referencedColumnName = "deptid")
	protected DepartmentInfoBean departmentInfoBean;
	
	
	
	@JsonProperty(value="manager-info")
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JsonIgnoreProperties({"gender","age","salary","phone","joiningDate","acno","email","designation","dob","password"})
	@JoinColumn(name="managerid",referencedColumnName="id") 
	protected EmpInfoBean mngId;




	

}
