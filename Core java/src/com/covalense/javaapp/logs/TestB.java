package com.covalense.javaapp.logs;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestB {
	public static final Logger Log=Logger.getLogger("amazon");
			
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		Log.setLevel(Level.ALL);
		
		try {
			FileHandler fh=new FileHandler("amazon.log");
			fh.setLevel(Level.INFO);
			fh.setFormatter(new SimpleFormatter());
			Log.addHandler(fh);
			
			Log.log(Level.SEVERE," hi its a SEVERR message");
			Log.log(Level.WARNING," hi its a SEVERR message");
			Log.log(Level.INFO," hi its a SEVERR message");
			Log.log(Level.CONFIG," hi its a SEVERR message");
			
			Register r=new Register();
			r.connect();
			System.out.println("done here");
			
			Login l=new Login();
			l.validate();
			System.out.println("done here also");
			
			
		} catch(SecurityException e) {
			e.printStackTrace();
		}catch(IOException  e) {
			e.printStackTrace();
		}
		
	}

}
