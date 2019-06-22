package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Pen {
	int cost = 10;

	public void write() {
		log.info("writing");
	}
}
