package com.covalense.javaapp.annotation;
import lombok.extern.java.Log;
@Log
public class Cow extends Ani{
	int a;
	void eit() {
		log.info("eating");
	}

	public static void main(String[] args) {
		Cow c =new Cow();
		c.eat();
		
	}

}
