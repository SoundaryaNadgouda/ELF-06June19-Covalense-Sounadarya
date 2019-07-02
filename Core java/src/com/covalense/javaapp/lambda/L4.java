package com.covalense.javaapp.lambda;

import java.util.function.Function;
import lombok.extern.java.Log;
@Log
public class L4 {

	public static void main(String[] args) {
		Function<Double,Double> f=r->3.142*r*r;
		double x=f.apply(5.2);
		log.info(" "+x);
	}

}
