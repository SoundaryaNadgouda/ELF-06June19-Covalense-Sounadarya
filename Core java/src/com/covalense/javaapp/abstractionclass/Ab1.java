package com.covalense.javaapp.abstractionclass;

import lombok.extern.java.Log;

@Log
public abstract class Ab1 extends Ab {
	void pencil() {
		log.info("it is pencil");
	}

	abstract void eraser();

}
