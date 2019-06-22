package com.covalense.javaapp.constructors;
import lombok.extern.java.Log;
@Log
class Animal {
	void eat() {
		log.info("eating");
	}
}
@Log
class Cow extends Animal {
	void eat() {
		log.info("eat something");
	}
}
@Log
class Lion extends Animal {
	void eat() {
		log.info("eat pls");
	}
}

class Pol {
	static Animal a;

	public static void main(String[] args) {
		a.eat();
	}

}
