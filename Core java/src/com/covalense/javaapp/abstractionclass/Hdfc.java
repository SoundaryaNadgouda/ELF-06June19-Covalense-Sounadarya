package com.covalense.javaapp.abstractionclass;

import lombok.extern.java.Log;

@Log
public class Hdfc implements Atm {
	public void valid() {
		log.info("hdfc card is valid");
	}

	public void info() {
		log.info("hdfc info is valid");
	}
}
