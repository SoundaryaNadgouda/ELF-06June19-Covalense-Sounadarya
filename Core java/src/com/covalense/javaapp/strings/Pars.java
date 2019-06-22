package com.covalense.javaapp.strings;
import lombok.extern.java.Log;
@Log
public class Pars {

	public static void main(String[] args) {
		String x = "40";
		String y = "50";
		log.info(x + y);
		int i = Integer.parseInt(x);
		int j = Integer.parseInt(y);
		log.info(" "+i + j);

		String p = "2.14";
		double k = Double.parseDouble(p);

		log.info(p);
		log.info(" "+k);

	}

}
