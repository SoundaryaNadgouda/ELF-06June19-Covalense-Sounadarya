package com.covalense.javaapp.lambda;

import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
public class L6 {

	public static void main(String[] args) {
		Supplier<GunL6> s=()->new GunL6(100);
		GunL6 g=s.get();
		log.info(" "+g.bullets);
		
	}

}
