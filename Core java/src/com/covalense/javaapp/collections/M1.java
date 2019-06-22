package com.covalense.javaapp.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import lombok.extern.java.Log;
@Log
public class M1 {

	public static void main(String[] args) {
		HashMap<String,Integer> h=new HashMap<>();
		h.put("One", 1);
		h.put("Two", 2);
		h.put("Three", 3);
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
