package com.covalense.javaapp.casting;

import lombok.extern.java.Log;

@Log
public class Child extends Parent {
	int j = 20;

	void run() {
		log.info("pls run");
	}
}
