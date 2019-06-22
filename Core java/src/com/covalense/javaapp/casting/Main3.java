package com.covalense.javaapp.casting;

public class Main3 {

	public static void main(String[] args) {
		Chips c = new Lays();
		Chips c1 = new Bingo();

		Lays l = (Lays) c;
		l.eat();

		Bingo b = (Bingo) c1;
		b.byteBingo();
	}

}
