package com.covalense.javaapp.doublecolonoperaror;

import lombok.extern.java.Log;

@Log
 class ColonOneTest {
	static void open(int x) {
		log.info("*************open method**********");
		log.info("------>open the door-------->");
	}
	public static void main(String[] args) {
		ColonOne r=ColonOneTest :: open;
		r.remove(6);
			
		
	}

}
