package com.covalense.springcore.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import lombok.extern.java.Log;
@Log

public class PetBean {
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Autowired
@Qualifier("donkey")
private Animal animal;

public Animal getAnimal() {
	return animal;
}

public void setAnimal(Animal animal) {
	this.animal = animal;
}
public void getInfo() {
	animal.eat();
	animal.makeSound();
}
}
