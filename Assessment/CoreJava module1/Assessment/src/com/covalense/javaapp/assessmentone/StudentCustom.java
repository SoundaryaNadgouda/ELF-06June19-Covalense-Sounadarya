package com.covalense.javaapp.assessmentone;

import java.util.logging.Logger;

public class StudentCustom extends Exception{
	public static final Logger log=Logger.getLogger("StudentCustomException");
	void testStudentAge(int n) {
		if(n>18) {
			log.info("student is allowed to take exam");
		}
		else {
			try {
				throw new NotEligibleException()  ;
			} catch (NotEligibleException e) {
				e.printStackTrace();
			}
		}
	}
}
