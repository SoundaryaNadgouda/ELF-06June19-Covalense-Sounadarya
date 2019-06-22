package com.covalense.javaapp.logs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyProduct {
	private static final Logger Loger = Logger.getLogger("priyanka");

	void buy() {
		Loger.log(Level.SEVERE, " its a SEVERR message");
		Loger.log(Level.WARNING, " SEVERR message");
		Loger.log(Level.INFO, "  a SEVERR message");
		Loger.log(Level.CONFIG, "  message");
		Loger.log(Level.SEVERE, " imp message");
		Loger.log(Level.FINE, " hi imp message");
		Loger.log(Level.FINER, "  its a imp message");
		Loger.log(Level.FINEST, "  a imp message");
	}

}
