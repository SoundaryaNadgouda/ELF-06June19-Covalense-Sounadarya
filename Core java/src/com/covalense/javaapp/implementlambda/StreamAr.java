package com.covalense.javaapp.implementlambda;

import java.util.stream.Stream;

import lombok.extern.java.Log;
@Log
public class StreamAr {

	public static void main(String[] args) {
		Integer []a= {5,6,4,2,1};
		Stream<Integer> s=Stream.of(a);
		s.forEach(i->log.info(" "+i));
	}

}
