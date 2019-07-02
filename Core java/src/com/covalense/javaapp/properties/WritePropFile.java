package com.covalense.javaapp.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class WritePropFile {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("demo.properties");
			
			Properties p=new Properties();
			p.setProperty("company name", "covalense");
			p.setProperty("phone no", "1234567890");
			
			p.store(fout, "company deatails");
			log.info("created");
			
		} catch (FileNotFoundException e) {
			log.info("exception");	
	}catch(IOException e) {
		log.info("io exception");
	}
}
}