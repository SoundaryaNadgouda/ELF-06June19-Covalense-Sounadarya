package com.covalense.javaapp.override;

import lombok.extern.java.Log;

@Log
public class Lvl2 extends Lvl {
	@Override
	public void run() {
		log.info("speed is 250km/hr");
	}

}
