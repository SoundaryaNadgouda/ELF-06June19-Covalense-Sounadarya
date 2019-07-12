package com.covalense.designpattern;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) {
		MyImmutableClass immutableClass=new MyImmutableClass("abc", 17, 6577776767L);
		log.info("Name is "+immutableClass.getName());
		log.info("Age is "+immutableClass.getAge());
		log.info("Number is "+immutableClass.getPhone());
	}

}
