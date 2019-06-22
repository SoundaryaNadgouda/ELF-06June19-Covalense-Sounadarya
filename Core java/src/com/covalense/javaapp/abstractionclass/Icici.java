package com.covalense.javaapp.abstractionclass;

import lombok.extern.java.Log;

@Log
class Icici implements Atm {
	public void valid() {
		log.info("icici card is validated");
	}

	public void info() {
		log.info("icici info is valid");
	}
}
