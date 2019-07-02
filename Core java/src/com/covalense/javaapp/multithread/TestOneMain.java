package com.covalense.javaapp.multithread;
import lombok.extern.java.Log;
@Log
public class TestOneMain {

	public static void main(String[] args) {
		log.info("Main started");
		TestOne t=new TestOne();
		t.setName("soundarya");
		t.start();
		TestOne t1=new TestOne();
		t1.setName("AN");
		t1.start();
		TestOne t2=new TestOne();
		t2.setName("Nadgouda");
		t2.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			log.info("exception");
		}
		log.info("Main ended");
	}

}
