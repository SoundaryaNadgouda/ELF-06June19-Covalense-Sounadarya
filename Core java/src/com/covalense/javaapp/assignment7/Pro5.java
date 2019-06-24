package com.covalense.javaapp.assignment7;
import java.util.logging.Logger;

public class Pro5 {
	private static final Logger log=Logger.getLogger("Pro5");

	public static void main(String[] args) {
		Pro5interface f = (num) -> {
			for (int i = 0; i <= num; i++)
				log.info(""+i);
		};
		 f.rang(5);
	}
}
