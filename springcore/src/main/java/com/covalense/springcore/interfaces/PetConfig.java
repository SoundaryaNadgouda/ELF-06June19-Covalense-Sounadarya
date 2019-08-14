package com.covalense.springcore.interfaces;

import org.springframework.context.annotation.Bean;

public class PetConfig {
	@Bean()
	public PetBean getPet() {
		return new PetBean();
	}
	
	@Bean(name="monkey")
	public Animal getAnimalMonkey() {
		return new Monkey();
	}
	
	@Bean(name="donkey")
	public Animal getAnimalDonkey() {
		return new Donkey();
	}
	


	
}
