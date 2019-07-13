package com.covalense.javaapp.assignmentseven;

import java.util.logging.Logger;



public class ProTwo {
	private static final Logger log=Logger.getLogger("Pro2");

	public static void main(String[] args) {
		ProTwoInterface f = (num) -> {
			int fa = 0;
			for (int i = 1; i <= num; i++)
				fa = i * i + 1;
			return fa;
		};
		int fa = f.fact(5);
		log.info(""+fa);

	}

}
