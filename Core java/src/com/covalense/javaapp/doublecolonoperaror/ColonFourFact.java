package com.covalense.javaapp.doublecolonoperaror;

import lombok.extern.java.Log;

@Log
class ColonFourFact {
	void calculate(int x) {
			int fa = 1;
			for (int j = 1; j <= x; j++)
				fa = fa*j ;
		log.info("------>print factorial------->");
		log.info(" fac is "+fa);
}	
}
