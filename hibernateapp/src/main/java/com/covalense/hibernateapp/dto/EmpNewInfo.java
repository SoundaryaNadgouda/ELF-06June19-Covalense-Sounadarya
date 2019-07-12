package com.covalense.hibernateapp.dto;

import lombok.Data;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "new_empinfo")
@Data

public class EmpNewInfo implements Serializable{
	@Id
	private int id;
	private String name;
	private String email;
}
