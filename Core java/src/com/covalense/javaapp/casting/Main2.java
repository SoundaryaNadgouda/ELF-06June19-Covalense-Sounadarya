package com.covalense.javaapp.casting;

import lombok.extern.java.Log;

@Log
public class Main2 {

	public static void main(String[] args) {
		Bus b = new Van();
		Van v = (Van) b;
		v.turn();
		log.info(" seats "+v.seats);
		v.move();
		log.info(" "+v.model);
	}

}
