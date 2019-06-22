package com.covalense.javaapp.abstractionclass;

import lombok.extern.java.Log;

@Log
public abstract class Goo {
	void login() {
		log.info("login successfull");
	}

	abstract void shareDoc();

}
