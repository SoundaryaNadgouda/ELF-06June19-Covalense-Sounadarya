package com.covalense.javaapp.collections;

import java.util.TreeMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import lombok.extern.java.Log;
@Log
public class MapFour {

	public static void main(String[] args) {
		TreeMap<String,Integer> h=new TreeMap<>();
		h.put("G", 2);
		h.put("S", 3);
		h.put("A", 1);
		h.put("Z", 4);
		
		Set<String> ts=h.keySet();
		for(String s:ts) {
        log.info(s);
		}
			log.info("_______________");
	
	
	Collection<Integer> ci=h.values();
	Iterator<Integer>it =ci.iterator();
	while(it.hasNext()) {
		Integer r=it.next();
		log.info(" "+r);
	}
	}	

}
