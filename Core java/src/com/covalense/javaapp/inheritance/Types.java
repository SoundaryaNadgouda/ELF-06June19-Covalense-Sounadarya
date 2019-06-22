package com.covalense.javaapp.inheritance;
import lombok.extern.java.Log;
@Log
class Single {
	public void eat() {
		log.info("eating");
	}

	public void sleep() {
		log.info("sleeping");
	}
}
@Log
class Types extends Single {
	public static void read() {
		log.info("reading");
	}

	public static void walk() {
		log.info("walking");
	}

	public static void main(String argc[]) {
		Single s = new Single();
		read();
		walk();
		s.sleep();
		s.eat();

	}
}
