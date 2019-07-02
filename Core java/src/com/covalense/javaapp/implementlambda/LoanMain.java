package com.covalense.javaapp.implementlambda;
import lombok.extern.java.Log;
@Log
public class LoanMain {

	public static void main(String[] args) {
		Loan t=Loan.HOME;
		Loan t1=Loan.CAR;
		
		int constValue=t.getValue();
		int value=t1.getValue();
		log.info("value of loan is "+constValue);
		log.info("value of car is "+value);
	}

}
