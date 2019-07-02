package com.covalense.javaapp.hasarelation;

import lombok.extern.java.Log;
@Log
public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.m.call();
		log.info(" "+p.i);
		p.talk();

	}

}
