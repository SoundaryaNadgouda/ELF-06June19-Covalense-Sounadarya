package com.covalense.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.covalense.springboot.dto.EmpInfoBean;

public interface EmployeeRepository extends CrudRepository<EmpInfoBean, Integer>{

	
}
