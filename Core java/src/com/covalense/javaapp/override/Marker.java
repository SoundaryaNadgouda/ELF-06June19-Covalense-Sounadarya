package com.covalense.javaapp.override;

import lombok.extern.java.Log;

@Log
public class Marker extends Pen {
	@Override
	public void write() {
		log.info("marker is writing");
	}
}
