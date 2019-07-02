package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
class Body {
	double he;
	double we;

	public double cal() {
		return we / (he * he);
		
	}

	public void dis(double c) {
		if (c >= 18.5 && c <= 24.5) {
			log.info("normal");
		} else if (c <= 18.5) {
			log.info("underweight");
		} else if (c >= 25 && c <= 29.9) {
			log.info("overweight");
		} else {
			log.info("obesse");
		}
	}
}

class Calculate {
	public static void main(String[] args) {
		Body b = new Body();
		b.we = 99.4;
		b.he = 4.7;
		double ans = b.cal();
		b.dis(ans);
	}
}
