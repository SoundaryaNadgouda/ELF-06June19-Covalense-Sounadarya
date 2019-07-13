package com.covalense.javaapp.assignmentseven;
import java.util.logging.Logger;

public class ProFive {
	private static final Logger log=Logger.getLogger("Pro5");

	public static void main(String[] args) {
		ProFiveInterface f = (num) -> {
			for (int i = 0; i <= num; i++)
				log.info(""+i);
		};
		 f.rang(5);
	}
}
