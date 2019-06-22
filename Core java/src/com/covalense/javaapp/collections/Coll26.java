package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.TreeSet;
import lombok.extern.java.Log;
@Log
public class Coll26 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(20);
		t.add(10);
		t.add(30);
		t.add(50);
		t.add(40);
		
		log.info("using for each loop");
		for(Object s:t) {
			log.info(" "+s);
	}
		log.info("using iterator");
		Iterator it=t.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			log.info(" "+r);
		}
	}

}
