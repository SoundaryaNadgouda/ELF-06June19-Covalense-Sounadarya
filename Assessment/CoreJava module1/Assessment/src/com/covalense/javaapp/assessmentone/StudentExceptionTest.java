package com.covalense.javaapp.assessmentone;

import java.util.logging.Logger;

public class StudentExceptionTest {
	public static final Logger log=Logger.getLogger("StudentCustomException");
public static void main(String[] args) {
	
	StudentCustom s=new StudentCustom();
	s.testStudentAge(11);
}
	
	
}
