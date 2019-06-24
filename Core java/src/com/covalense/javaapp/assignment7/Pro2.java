package com.covalense.javaapp.assignment7;

import java.util.logging.Logger;



public class Pro2 {
	private static final Logger log=Logger.getLogger("Pro2");

	public static void main(String[] args) {
		Pro2interface f = (num) -> {
			int fa = 0;
			for (int i = 1; i <= num; i++)
				fa = i * i + 1;
			return fa;
		};
		int fa = f.fact(5);
		log.info(""+fa);

	}

}
