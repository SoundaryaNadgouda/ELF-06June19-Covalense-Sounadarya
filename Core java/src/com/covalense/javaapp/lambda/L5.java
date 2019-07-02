package com.covalense.javaapp.lambda;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
public class L5 {
	public static void main(String[] args) {
		Function<String,Integer> f=s->s.length()	;
		int x=f.apply("abcdef");
		log.info(" "+x);
}
}