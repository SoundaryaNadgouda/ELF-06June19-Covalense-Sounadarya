package com.covalense.javaapp.collections;

import java.util.HashSet;
import java.util.Iterator;
import lombok.extern.java.Log;
@Log
public class Coll23 {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<>();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add("d");
		h.add("e");
		
		log.info("using for each loop");
		for(String s:h) {
			log.info(s);
	}
		log.info("using iterator");
		Iterator<String> it=h.iterator();
		while(it.hasNext()) {
			String r=it.next();
			log.info(r);
		}
	}

}
