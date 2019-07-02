package com.covalense.javaapp.multithread;

import lombok.extern.java.Log;
@Log
public class Pvr {
	synchronized void book() {
		for(int i=1;i<5;i++) {
			log.info(" "+i);
			try {
				wait();
			} catch (InterruptedException e) {
				log.info("exception");
			}
		}
	}
	synchronized void leaveMe() {
		notifyAll();
	}
}
