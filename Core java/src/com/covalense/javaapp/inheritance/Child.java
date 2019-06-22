package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Child extends Over {
	@Override
	public void bike() {
		log.info("scooty");
	}
}
