package com.covalense.springcore.assignment;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.extern.java.Log;
@Log
@Data
public class Dell implements Laptop{

	private String BRAND="DELL";
	private String color="red";
	private double cost=7500;
	private double weight=3.5;
	private int  ram=3;
	private String os="mac";
	@Autowired
	private StorageDevice storageDevice;
	
	
	public void display() {
		log.info("displaying with the color"+color);
	}

	public void process() {
		log.info("process with the ram size"+ram);

	}

	public void showSpecification() {
		log.info("Brand = "+BRAND);
		log.info("cost of laptop="+cost);
		log.info("weight of laptop="+color);
		storageDevice.read();
		storageDevice.write(); 
		storageDevice.format();
	}


}
