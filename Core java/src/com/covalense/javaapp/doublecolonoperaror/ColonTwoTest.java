package com.covalense.javaapp.doublecolonoperaror;

import lombok.extern.java.Log;

@Log
public class ColonTwoTest {
	static void sum(int x,int y) {
		log.info("*************add numbers**********");
		log.info("------>print sum------->");
	}
	public static void main(String[] args) {
		ColonTwo m=ColonTwoTest :: sum;
		m.add(5,6);
	}

}
