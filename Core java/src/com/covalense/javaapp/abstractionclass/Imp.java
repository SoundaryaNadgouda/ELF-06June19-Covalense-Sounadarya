package com.covalense.javaapp.abstractionclass;

import lombok.extern.java.Log;

@Log
public class Imp implements Ani, Human {
	public void talk() {
		log.info("talking");
	}

	public void eat() {
		log.info("eating");
	}

}
