package com.covalense.springcore.assignment;

import lombok.extern.java.Log;

@Log
public class PenDrive implements StorageDevice {
	void capcity() {
		log.info("PenDrive capcity is 4TB ");
	}
	void writingSpeed() {
		log.info("writingSpeed is 2.5 ");
	}
	
	void readingSpeed() {
		log.info("readingSpeed is 3.9 ");

	}

	public void write() {
		log.info("writing ");
	
	}

	public void read() {
		log.info("reading ");
		
	}

	public void format() {
		log.info("formating ");
		
	}
}