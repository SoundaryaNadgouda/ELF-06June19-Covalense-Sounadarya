package com.covalense.javaapp.logs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {
	public static final Logger Log=Logger.getLogger("amazon");
	void validate()
	{
		Log.log(Level.SEVERE," hi  a SEVERR message");
		Log.log(Level.WARNING," its a SEVERR message");
		Log.log(Level.INFO,"  a SEVERR message");
		Log.log(Level.CONFIG," SEVERR message");
	}

}
