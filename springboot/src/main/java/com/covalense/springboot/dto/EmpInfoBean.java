package com.covalense.springboot.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@SuppressWarnings("serial")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property = "id")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="emp-info-bean")
//@XmlAccessorType(XmlAccessType.FIELD)

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
	
	/*
	 * @JsonProperty(value="training-info")
	 * 
	 * @LazyCollection(LazyCollectionOption.FALSE)
	 * 
	 * @ManyToMany(cascade = CascadeType.ALL,mappedBy = "infoBeans") protected
	 * List<TrainingInfo> trainingInfoBean;
	 */

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



	public EmpOtherInfoBean getEmpOtherInfoBean() {
		return empOtherInfoBean;
	}



	public void setEmpOtherInfoBean(EmpOtherInfoBean empOtherInfoBean) {
		this.empOtherInfoBean = empOtherInfoBean;
	}



	public List<EmpAddressInfo> getAdressInfoBean() {
		return adressInfoBean;
	}



	public void setAdressInfoBean(List<EmpAddressInfo> adressInfoBean) {
		this.adressInfoBean = adressInfoBean;
	}



	public List<EmpEducationInfo> getEducationInfoBean() {
		return educationInfoBean;
	}



	public void setEducationInfoBean(List<EmpEducationInfo> educationInfoBean) {
		this.educationInfoBean = educationInfoBean;
	}



	public List<EmpExperienceInfo> getExperienceInfoBean() {
		return experienceInfoBean;
	}



	public void setExperienceInfoBean(List<EmpExperienceInfo> experienceInfoBean) {
		this.experienceInfoBean = experienceInfoBean;
	}



	/*
	 * public List<TrainingInfo> getTrainingInfoBean() { return trainingInfoBean; }
	 * 
	 * 
	 * 
	 * public void setTrainingInfoBean(List<TrainingInfo> trainingInfoBean) {
	 * this.trainingInfoBean = trainingInfoBean; }
	 * 
	 */

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	public Long getPhone() {
		return phone;
	}



	public void setPhone(Long phone) {
		this.phone = phone;
	}



	public Date getJoiningDate() {
		return joiningDate;
	}



	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}



	public long getAcno() {
		return acno;
	}



	public void setAcno(long acno) {
		this.acno = acno;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public DepartmentInfoBean getDepartmentInfoBean() {
		return departmentInfoBean;
	}



	public void setDepartmentInfoBean(DepartmentInfoBean departmentInfoBean) {
		this.departmentInfoBean = departmentInfoBean;
	}



	public EmpInfoBean getMngId() {
		return mngId;
	}



	public void setMngId(EmpInfoBean mngId) {
		this.mngId = mngId;
	}




	

}
