package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
public class Rs {
	public static void main(String[] args) {
		double dol = 69.55;
		double euro = 78.58;
		log.info("thousand rs in doller is" + (1000 / dol));
		log.info("thousand rs in euro is" + (1000 / euro));
	}

}
