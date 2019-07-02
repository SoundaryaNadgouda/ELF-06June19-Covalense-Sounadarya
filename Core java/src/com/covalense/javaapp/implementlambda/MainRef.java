package com.covalense.javaapp.implementlambda;

import lombok.extern.java.Log;

@Log
public class MainRef {

	public static void main(String[] args) {
		DemoRef d=x->log.info(" "+x);
		d.print(7);
		
		DemoRef a=PenRef::write;
		a.print(10);
		
	}

}
