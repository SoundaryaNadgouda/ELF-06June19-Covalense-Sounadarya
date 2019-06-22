package com.covalense.javaapp.constructors;
import lombok.extern.java.Log;

class A1 {
	int i = 10;
}
@Log
class B1 extends A1 {
	int i = 89;

	void m() {
		
		log.info(" "+this.i);
	log.info(" "+super.i);
	}
}

class Sup {
	public static void main(String[] args) {
		B1 b = new B1();
		b.m();
	}

}
