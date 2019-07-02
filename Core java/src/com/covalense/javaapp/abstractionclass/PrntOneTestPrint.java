package com.covalense.javaapp.abstractionclass;

import lombok.extern.java.Log;

@Log
class PrntOneTestPrint implements Prnt {
	public void write() {
		log.info("writing");
	}

}
