package com.covalense.javaapp.casting;

import lombok.extern.java.Log;

@Log
public class Van extends Bus {
	int seats = 79;

	void turn() {
		log.info("take turn");
	}
}
