package com.covalense.javaapp.abstractionclass;

import lombok.extern.java.Log;

@Log
class Sbi implements Atm {
	public void valid() {
		log.info("sbi card is valid");
	}

	public void info() {
		log.info("sbi  info is valid");
	}
}