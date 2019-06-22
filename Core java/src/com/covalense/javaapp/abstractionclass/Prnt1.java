package com.covalense.javaapp.abstractionclass;

import lombok.extern.java.Log;

@Log
class Prnt1 implements Prnt {
	public void write() {
		log.info("writing");
	}

}
