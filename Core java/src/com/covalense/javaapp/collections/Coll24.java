package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;


import lombok.extern.java.Log;

@Log
public class Coll24 {

	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		
		log.info("using for each loop");
		for(Object s:h) {
			log.info(" "+s);
	}
		log.info("using iterator");
		Iterator it=h.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			log.info(" "+r);
		}
	}

}
