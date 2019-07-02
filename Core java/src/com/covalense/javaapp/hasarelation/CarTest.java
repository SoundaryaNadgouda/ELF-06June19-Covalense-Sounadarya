package com.covalense.javaapp.hasarelation;
import lombok.extern.java.Log;
@Log
public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		c.m.s = "nmop";
		c.m.sing();
		c.run();
		log.info("song is " + c.m.s);
	}

}
