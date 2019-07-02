package com.covalense.javaapp.implementlambda;
import lombok.extern.java.Log;
@Log
public class TestSwitch {

	public static void main(String[] args) {
		String s="Apple";
		switch(s) {
		case "Apple":log.info("hii apple");
		break;
		case "Orange":log.info("hii orange");
		break;
		case "Mango":log.info("hii mango");
		break;
		}
	}

}
