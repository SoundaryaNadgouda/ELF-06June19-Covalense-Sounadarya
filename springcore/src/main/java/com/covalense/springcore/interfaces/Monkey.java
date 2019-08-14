package com.covalense.springcore.interfaces;

import lombok.extern.java.Log;

@Log
public class Monkey implements Animal{

	@Override
	public void eat() {
		log.info("monkey eats");
		
	}

	@Override
	public void makeSound() {
	log.info("monkey makes sound");
		
	}

}
