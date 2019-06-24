package com.covalense.javaapp.assignment7;
import java.util.logging.Logger;

public class Pro1 {
	private static final Logger log=Logger.getLogger("Pro1");

	static Pro1interface s=(a,b)-> a+b;
		public static void main(String[] args) {
			int i=s.add(5,10);
			log.info("addtion= "+i);
			
		}
}
