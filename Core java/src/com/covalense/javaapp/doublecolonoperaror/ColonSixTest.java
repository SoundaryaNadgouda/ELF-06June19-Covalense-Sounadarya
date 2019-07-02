package com.covalense.javaapp.doublecolonoperaror;

import lombok.extern.java.Log;

@Log
public class ColonSixTest {

	public static void main(String[] args) {
		ColonSix o=ColonSixBoy :: new;
		ColonSixBoy o1=o.getDetails("abc",5.5,23);
		log.info("boy details are "+ o1.name +" "+ o1.height +" "+ o1.age);
		
	}

}
