 package com.covalense.springcore.assignment;

import lombok.extern.java.Log;

@Log
public class HardDisk implements StorageDevice {
	void capcity() {
		log.info("HardDisk capcity is 2TB ");
	}
	void writingSpeed() {
		log.info("writingSpeed is 3.7 ");
	}
	
	void readingSpeed() {
		log.info("readingSpeed is 2.5 ");

	}

	public void write() {
		 writingSpeed();
		log.info("write something ");
	
	}

	public void read() {
		readingSpeed();
		log.info("read something ");
		
	}

	public void format() {
		capcity();
		log.info("formating ");
		
	}
	
}