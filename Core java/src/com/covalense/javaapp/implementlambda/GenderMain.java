package com.covalense.javaapp.implementlambda;
import lombok.extern.java.Log;
@Log
public class GenderMain {

	public static void main(String[] args) {
		Gender t=Gender.MALE;
		
		switch(t) {
		case MALE:log.info("male");
							break;
		case FEMALE:log.info("female");
		break;	
		case OTHERS:log.info("others");
		break;
		}
	}

}
