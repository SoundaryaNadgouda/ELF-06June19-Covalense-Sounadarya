package com.cov.javaapp.basicConcepts;

import lombok.extern.java.Log;

@Log
class Prop {
	String name;
	String comp;

	public void task() {
		log.info("sleep");
	}
}
@Log
class Girl {
	public static void main(String[] args) {
		Prop p = new Prop();
		p.name = "soundarya";
		p.comp = "covalence";
		p.task();
		log.info("name is " + p.name);
		log.info("comp is " + p.comp);
	}

}
