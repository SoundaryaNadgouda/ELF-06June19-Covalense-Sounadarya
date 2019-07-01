package com.covalense.javaapp.assignmentseven;
import java.util.logging.Logger;

public class ProFour {
	private static final Logger log=Logger.getLogger("Pro4");

	public static void main(String[] args) {
		ProFourInterface s = (sqr) -> {
			return sqr * sqr;
		};
		int sqr = s.sqrt(5);
		log.info(""+sqr);

	}

}
