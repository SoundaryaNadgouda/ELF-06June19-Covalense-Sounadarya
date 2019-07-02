package com.covalense.javaapp.implementlambda;

import java.util.stream.Stream;

import lombok.extern.java.Log;
@Log
public class StreamGrpValues {

	public static void main(String[] args) {
		Stream<Integer> s=Stream.of(6,3,7,2,1);
		s.forEach(i->log.info(" "+i));
	}

}
