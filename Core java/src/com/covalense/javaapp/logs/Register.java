package com.covalense.javaapp.logs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	public static final Logger Log=Logger.getLogger("amazon");
	void connect()
	{
		Log.log(Level.SEVERE,"  its a SEVERR message");
		Log.log(Level.WARNING," hi  a SEVERR message");
		Log.log(Level.INFO," a SEVERR message");
		Log.log(Level.CONFIG," SEVERR message");
	}
}
