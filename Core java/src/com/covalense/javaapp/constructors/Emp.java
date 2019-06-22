package com.covalense.javaapp.constructors;
import lombok.extern.java.Log;
@Log
public class Emp {
	String name;
	int id;
	int sal;

	Emp(String name, int id, int sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	void dis() {
		log.info("name is " + this.name);
		log.info("id is " + this.id);
	log.info("sal is " + this.sal);

	}
}
