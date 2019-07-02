package com.covalense.javaapp.multithread;

public class MarkerMain {

	public static void main(String[] args) {
		Marker m=new Marker();
		Thread t=new Thread(m);
		t.start();
		
		Thread t1=new Thread(m);
		t1.start();
		
	}

}
