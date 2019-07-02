package com.covalense.javaapp.multithread;

import java.util.concurrent.Callable;

 class Pen implements Callable<Integer>{

	public Integer call() {
	return 120;
}
}