package com.covalense.javaapp.collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import lombok.extern.java.Log;
@Log
public class MapTwo {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> h=new LinkedHashMap<>();
		h.put("Two", 1);
		h.put("Three", 2);
		h.put("One", 3);
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
