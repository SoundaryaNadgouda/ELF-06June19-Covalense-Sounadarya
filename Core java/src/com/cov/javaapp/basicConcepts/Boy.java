package com.cov.javaapp.basicConcepts;

import lombok.extern.java.Log;

@Log
class Cal {
	String name;
	String comp;

	public void task() {
		log.info("sleep");
	}
}

@Log
class Boy {
	public static void main(String[] args) {
		Cal c = new Cal();
		c.name = "xyz";
		c.comp = "abc";
		c.task();
		log.info("name is " + c.name);
		log.info("comp is " + c.comp);

	}

}
