package com.covalense.javaapp.assessmentone;

import java.util.logging.Logger;

public class CalculateTest {
	
	public static final Logger log=Logger.getLogger("CalculateTest");
	
	public static void main(String[] args) {
		
		Calculate c=new Calculate();
		
		double res=c.calculateSimpleInterest(1000, 2, 2.5);
		log.info("simple interest is "+res);
		
		double res1=c.calculatePercentage(60, 80.5, 35, 750);
		log.info(" percentage is "+res1);
		
		int res3=c.calculateFact(5);
		log.info("factorial of n is "+res3);
	}

}

