package com.covalense.javaapp.encapsulation;
import lombok.extern.java.Log;
@Log
public class DbOne {
	void rcve(Per p) {
		log.info("hi");
		log.info("age of db1 is " + p.getAge());
		log.info("name of db1 is " + p.getName());
	}
}
