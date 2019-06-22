package com.covalense.javaapp.abstractionclass;

import lombok.extern.java.Log;

@Log
public abstract class Ab {
	void pen() {
		log.info("it is pen");
	}

	abstract void pencil();

	abstract void eraser();
}
