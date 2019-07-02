package com.covalense.javaapp.lambda;

import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
public class L7 {

	public static void main(String[] args) {
		Supplier<CarL7> s=()->new CarL7(55.6);
		CarL7 g=s.get();
		log.info(" "+g.fuel);
		
	}

}
