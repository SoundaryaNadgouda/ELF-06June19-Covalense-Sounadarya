package com.covalense.javaapp.abstractionclass;

import lombok.extern.java.Log;

@Log
public class Gmail extends Goo {
	void shareDoc() {
		log.info("sharing is successfull");
	}
}
