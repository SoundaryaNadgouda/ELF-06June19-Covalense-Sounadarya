package com.covalense.javaapp.hasarelation;
import com.covalense.javaapp.exceptions.Ex2;

import lombok.extern.java.Log;
@Log
public class Main7 {

	public static void main(String[] args) {
		Person p = new Person();
		p.m.call();
		log.info(" "+p.i);
		p.talk();

	}

}
