package com.covalense.javaapp.casting;

public class Casting {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = (Child) p;
		c.run();

	}

}
