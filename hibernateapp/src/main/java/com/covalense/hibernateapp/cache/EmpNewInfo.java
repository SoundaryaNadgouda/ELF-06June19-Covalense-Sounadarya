package com.covalense.hibernateapp.cache;

import lombok.Data;
import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "new_empinfo")
@Data
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)

public class EmpNewInfo implements Serializable{
	@Id
	private int id;
	private String name;
	private String email;
}
