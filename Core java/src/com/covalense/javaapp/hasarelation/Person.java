package com.covalense.javaapp.hasarelation;
import lombok.extern.java.Log;
@Log
public class Person {
	Mobile m = new Mobile();
	int i = 5;

	void talk() {
		log.info("talking");
	}
}
