package com.cov.javaapp.basicConcepts;

import lombok.extern.java.Log;

@Log
class Func {
	 double we;
	 double he;

	public void behav() {
		log.info("eat");
	}
}

@Log
class Animal {
	public static void main(String[] args) {
		Func f = new Func();
		f.we = 51.5;
		f.he = 6.2;
		f.behav();
		log.info("weight is " + f.we);
		log.info("weight is " + f.he);
	}
}
