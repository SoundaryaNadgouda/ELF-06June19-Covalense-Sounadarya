package com.covalense.javaapp.encapsulation;

public class DbTest {

	public static void main(String[] args) {
		Per p = new Per();
		Per p1 = new Per();
		DbOne d1 = new DbOne();
		DbTwo d2 = new DbTwo();
		p.setAge(46);
		p.setName("abcd");
		p1.setAge(67);
		p1.setName("xyz");

		d1.rcve(p);
		d2.rcve(p1);

	}

}
