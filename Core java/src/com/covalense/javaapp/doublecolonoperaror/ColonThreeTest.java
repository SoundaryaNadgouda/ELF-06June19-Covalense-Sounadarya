package com.covalense.javaapp.doublecolonoperaror;

public class ColonThreeTest {

	public static void main(String[] args) {
		Colon3Calculate c=new Colon3Calculate();
		ColonThree o=c :: calculate;
		o.avg(50, 100, 150);
		
	}

}
