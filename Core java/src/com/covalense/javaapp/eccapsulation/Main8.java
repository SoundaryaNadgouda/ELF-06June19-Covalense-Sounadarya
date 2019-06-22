package com.covalense.javaapp.eccapsulation;

public class Main8 {

	public static void main(String[] args) {
		Per p = new Per();
		Per p1 = new Per();
		Db1 d1 = new Db1();
		Db2 d2 = new Db2();
		p.setAge(46);
		p.setName("abcd");
		p1.setAge(67);
		p1.setName("xyz");

		d1.rcve(p);
		d2.rcve(p1);

	}

}
