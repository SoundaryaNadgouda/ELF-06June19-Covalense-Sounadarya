package com.covalense.javaapp.multithread;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable{
	public void run() {
		log.info("thread");
		log.info("multithreadening");
		for(int i=1;i<5;i++) {
			try {
				log.info(" "+i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				log.info("exception");
			}
		}
	}
}

