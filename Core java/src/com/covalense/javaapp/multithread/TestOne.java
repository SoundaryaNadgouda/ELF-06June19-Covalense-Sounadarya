package com.covalense.javaapp.multithread;
import lombok.extern.java.Log;
@Log
public class TestOne extends Thread{
	
	@Override
	public void run() {
		log.info("multithreadening");
		for(int i=1;i<5;i++) {
			try {
				log.info(" "+i);
				sleep(2000);
			} catch (InterruptedException e) {
				log.info("exception");
			}
		}
		
	}
}
