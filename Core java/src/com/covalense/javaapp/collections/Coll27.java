package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.TreeSet;
import lombok.extern.java.Log;
@Log
public class Coll27 {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		
		log.info("using for each loop");
		for(String s:t) {
			log.info(s);
	}
		log.info("using iterator");
		Iterator<String> it=t.iterator();
		while(it.hasNext()) {
			String r=it.next();
			log.info(" "+r);
		}
	}

}
