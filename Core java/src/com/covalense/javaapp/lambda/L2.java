package com.covalense.javaapp.lambda;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
public class L2 {
	static Predicate<String> p=a->a.length()>=5;
	public static void main(String[] args) {
		boolean x=p.test("abc");
		log.info(" "+x);
	}
	}


