package com.covalense.xmlexample.dto;

import java.io.Serializable;
import lombok.Data;

@Data

public class DepartmentInfoBean implements Serializable {
	
	private int deptid;
	private String deptname;

}
