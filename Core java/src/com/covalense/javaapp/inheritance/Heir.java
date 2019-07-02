package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;
@Log
class Heirac {
	public void talk() {
		log.info("talking");
	}

	public void run() {
		log.info("running");
	}
}
@Log
class child1 extends Heirac {
	public static void fruit() {
		log.info("apple");
	}
}
@Log
class Heir extends Heirac {
	public static void animal() {
		log.info("tiger");
	}

	public static void main(String[] args) {
		Heirac h = new Heirac();
		animal();
		h.talk();
		h.run();
		child1 c = new child1();
		c.talk();
		c.run();

	}

}
