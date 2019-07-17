package com.covalense.criteria;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class CustomerBean implements Serializable{
	@javax.persistence.Id
	private int Id ;
	private String firstName;
	private String lastName;
	private String cityname;
	

}
