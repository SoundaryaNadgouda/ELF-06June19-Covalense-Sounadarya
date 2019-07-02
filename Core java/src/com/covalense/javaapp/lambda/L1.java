package com.covalense.javaapp.lambda;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class L1 {
	static Predicate<Integer> p=a->a%2==0;
	public static void main(String[] args) {
		boolean x=p.test(10);
		log.info(" "+x);
	}

}
