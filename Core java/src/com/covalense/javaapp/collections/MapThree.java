package com.covalense.javaapp.collections;

import java.util.Map.Entry;
import java.util.TreeMap;
import lombok.extern.java.Log;
@Log
public class MapThree {

	public static void main(String[] args) {
		TreeMap<String,Integer> h=new TreeMap<>();
		h.put("Two", 2);
		h.put("Three", 3);
		h.put("One", 1);
		h.put("Four", 4);
		
		for(Entry<String, Integer> e: h.entrySet()) {
			String key=e.getKey();
			Integer value=e.getValue();
			
			log.info("Key is "+key);
			log.info("Value is "+value);
			
			log.info("_______________");
			
	}
	}
}
