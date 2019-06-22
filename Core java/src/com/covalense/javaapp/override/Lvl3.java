package com.covalense.javaapp.override;
import lombok.extern.java.Log;
@Log
public class Lvl3 extends Lvl2 {
	@Override
	public void run() {
		log.info("speed is 350km/hr");
	}
}
