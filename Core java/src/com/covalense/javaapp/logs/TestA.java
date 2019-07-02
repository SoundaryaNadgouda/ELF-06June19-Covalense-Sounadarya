package com.covalense.javaapp.logs;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.covalense.javaapp.exceptions.ExTwo;

import lombok.extern.java.Log;
@Log
public class TestA {
	private static final Logger Loger=Logger.getLogger("priyanka");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		Loger.setLevel(Level.ALL);
		
		try {
			FileHandler fh=new FileHandler("myFevLogdata.log",true);
			fh.setLevel(Level.SEVERE);
			fh.setFormatter(new SimpleFormatter());
			Loger.addHandler(fh);
			
			Loger.log(Level.SEVERE,"  its a SEVERR message");
			Loger.log(Level.WARNING," hi its a SEVERR message");
			Loger.log(Level.INFO," a SEVERR message");
			Loger.log(Level.CONFIG,"  SEVERR message");
			Loger.log(Level.SEVERE," hi its a SEVER message");
			Loger.log(Level.FINE," message");
			Loger.log(Level.FINER," hi its a SEVERR message");
			Loger.log(Level.FINEST," hi its a SEVERR message");
			
			BuyProduct by=new BuyProduct();
			by.buy();
			log.info("done");
			}
		catch(SecurityException e) {
			e.printStackTrace();
		}catch(IOException  e) {
			e.printStackTrace();
		}
		

	}
			
			
		}
		
		
