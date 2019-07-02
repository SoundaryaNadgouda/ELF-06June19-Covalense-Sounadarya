package com.covalense.javaapp.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class ReadPropFile {

	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("demo.properties");
			
			Properties p=new Properties();
			p.load(fin);
			
			String name=p.getProperty("company name");
			String phone=p.getProperty("phone no");
			
			log.info("phone number is "+phone);
			log.info("name number is "+name);
			
		} catch (FileNotFoundException e) {
			log.info("exception");	
	}catch(IOException e) {
		log.info("io exception");
	}
}
}