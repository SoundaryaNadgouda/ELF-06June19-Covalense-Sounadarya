package com.covalense.springcore.assignment;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.extern.java.Log;
@Log
@Data
public class HP implements Laptop{

	private String BRAND="HP";
	private String color="black";
	private double cost=8550;
	private double weight=5.5;
	private int  ram=1;
	private String os="window";
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
	}


}
