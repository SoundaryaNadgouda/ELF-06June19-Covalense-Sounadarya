package com.covalense.javaapp.polymorphism;
import lombok.extern.java.Log;
@Log
public class Pen {
	public void write() {
		log.info("writing");
	}

	public void open() {
		log.info("opening");
	}
}
