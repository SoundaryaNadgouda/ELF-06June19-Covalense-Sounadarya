package com.covalense.javaapp.casting;

import lombok.extern.java.Log;

@Log
public class Main1 {

	public static void main(String[] args) {
		Pen p = new Marker();
		Marker m = (Marker) p;
		m.color();
		log.info("size is "+m.size);

	}

}
