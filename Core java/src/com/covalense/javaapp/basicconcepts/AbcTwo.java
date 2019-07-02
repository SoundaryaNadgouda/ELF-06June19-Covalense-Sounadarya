package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
public class AbcTwo {

	public static void main(String[] args) 
	{
		int a=20;
		int b=30;
		int c=40;
		int sum;
		sum=(a+b+c)/3;
		log.info(" res "+sum);
	}

}
