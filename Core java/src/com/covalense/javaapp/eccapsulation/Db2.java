package com.covalense.javaapp.eccapsulation;
import lombok.extern.java.Log;
@Log
public class Db2 {
	void rcve(Per p) {
		log.info("age of db2 is " + p.getAge());
		log.info("name of db2 is " + p.getName());
	}
}
