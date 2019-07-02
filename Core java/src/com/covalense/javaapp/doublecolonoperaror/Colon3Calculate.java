package com.covalense.javaapp.doublecolonoperaror;

import lombok.extern.java.Log;

@Log
public class Colon3Calculate {
	void calculate(int x,int y,int z) {
		double r=(x+y+z)/3;
		log.info("------>print avg------->");
		log.info(" avg is "+r);
		
	}
}

