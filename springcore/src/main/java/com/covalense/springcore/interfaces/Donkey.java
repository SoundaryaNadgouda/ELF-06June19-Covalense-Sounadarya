package com.covalense.springcore.interfaces;

import lombok.extern.java.Log;

@Log
public class Donkey implements Animal{

	@Override
	public void eat() {
		log.info("donkey eats");
		
	}

	@Override
	public void makeSound() {
	log.info("donkey makes sound");
		
	}

}
