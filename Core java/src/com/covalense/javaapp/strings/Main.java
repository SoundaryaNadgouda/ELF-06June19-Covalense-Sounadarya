package com.covalense.javaapp.strings;
import lombok.extern.java.Log;
@Log
public class Main {

	public static void main(String[] args) {
		Per p = new Per(45, "abc");
		log.info("name is " + p.getName());
		log.info("Age is " + p.getAge());

	}

}
