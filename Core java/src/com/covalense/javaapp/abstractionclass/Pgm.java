package com.covalense.javaapp.abstractionclass;

import lombok.extern.java.Log;

@Log
public abstract class Pgm {
	public void hi() {
		log.info("hi");
	}

	abstract void hello();
}
