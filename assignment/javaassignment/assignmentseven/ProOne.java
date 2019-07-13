package com.covalense.javaapp.assignmentseven;
import java.util.logging.Logger;

public class ProOne {
	private static final Logger log=Logger.getLogger("Pro1");

	static ProOneInterface s=(a,b)-> a+b;
		public static void main(String[] args) {
			int i=s.add(5,10);
			log.info("addtion= "+i);
			
		}
}
