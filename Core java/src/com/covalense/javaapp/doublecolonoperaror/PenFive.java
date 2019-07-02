package com.covalense.javaapp.doublecolonoperaror;

import lombok.extern.java.Log;
@Log
public class PenFive {
	PenFive(){
		log.info(" zero parameterised constructor");
	}
	PenFive(int x){
		log.info(" parameterised constructor");
	}
}
