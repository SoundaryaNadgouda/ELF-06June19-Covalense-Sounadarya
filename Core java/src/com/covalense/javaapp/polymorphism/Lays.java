package com.covalense.javaapp.polymorphism;
import lombok.extern.java.Log;
@Log
public class Lays extends Chips {
	@Override
	public void lays() {
		log.info("eating lays");
	}

}
