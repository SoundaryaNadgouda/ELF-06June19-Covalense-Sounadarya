package com.covalense.javaapp.assignment7;
import java.util.logging.Logger;

public class Pro4 {
	private static final Logger log=Logger.getLogger("Pro4");

	public static void main(String[] args) {
		Pro4interface s = (sqr) -> {
			return sqr * sqr;
		};
		int sqr = s.sqrt(5);
		log.info(""+sqr);

	}

}
