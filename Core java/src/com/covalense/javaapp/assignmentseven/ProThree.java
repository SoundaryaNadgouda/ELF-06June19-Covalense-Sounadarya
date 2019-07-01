package com.covalense.javaapp.assignmentseven;
import java.util.logging.Logger;

public class ProThree {
	private static final Logger log=Logger.getLogger("Pro3");

	public static void main(String[] args) {
		ProThreeInterface m = () -> {
			log.info("hi this is lambda");
		};
		m.msg();
	}

}
