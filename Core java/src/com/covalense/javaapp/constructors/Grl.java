package com.covalense.javaapp.constructors;
import lombok.extern.java.Log;
@Log
class Grl {
	void rcve(Phn p) {
		if (p instanceof Mi) {
			log.info("thank u bro");
		} else if (p instanceof Iphn) {
			log.info("i love u");
		}

	}
}
