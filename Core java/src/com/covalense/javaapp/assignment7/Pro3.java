package com.covalense.javaapp.assignment7;
import java.util.logging.Logger;

public class Pro3 {
	private static final Logger log=Logger.getLogger("Pro3");

	public static void main(String[] args) {
		Pro3interface m = () -> {
			log.info("hi this is lambda");
		};
		m.msg();
	}

}
