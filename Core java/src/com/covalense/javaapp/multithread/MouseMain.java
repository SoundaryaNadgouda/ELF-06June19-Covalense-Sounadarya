package com.covalense.javaapp.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MouseMain {

	public static void main(String[] args) {
		Mouse m1=new Mouse("1st thread");
		Mouse m2=new Mouse("2nd thread");
		Mouse m3=new Mouse("3rd thread");
		Mouse m4=new Mouse("4th thread");
		Mouse m5=new Mouse("5th thread");
		
		ExecutorService e=Executors.newFixedThreadPool(2);
		e.execute(m1);
		e.execute(m2);
		e.execute(m3);
		e.execute(m4);
		e.execute(m5);
		
		e.shutdown();
	}

}
