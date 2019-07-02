package com.covalense.javaapp.encapsulation;
import lombok.extern.java.Log;
@Log
public class DbTwo {
	void rcve(Per p) {
		log.info("age of db2 is " + p.getAge());
		log.info("name of db2 is " + p.getName());
	}
}
