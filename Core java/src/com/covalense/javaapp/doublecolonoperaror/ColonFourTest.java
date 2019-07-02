package com.covalense.javaapp.doublecolonoperaror;

public class ColonFourTest {

	public static void main(String[] args) {
		ColonFourFact c=new ColonFourFact();
		ColonFour o=c :: calculate;
		o.call(5);
		
	}

}
