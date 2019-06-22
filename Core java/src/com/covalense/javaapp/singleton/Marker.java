package com.covalense.javaapp.singleton;
import lombok.extern.java.Log;
@Log
public class Marker {
	private static final Marker m = new Marker();

	private Marker() {
		log.info("write");
	}

	public static Marker getMarker() {
		return m;
	}

}
