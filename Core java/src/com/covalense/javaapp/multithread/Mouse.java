package com.covalense.javaapp.multithread;

import lombok.extern.java.Log;

@Log
public class Mouse implements Runnable{
	String name;

	public Mouse(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		log.info(name +"--------->started");
		for(int i=1;i<5;i++) {
			log.info(" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				log.info("exception");
			}
	}
		log.info(name +"--------->ended");
	}
	
}
