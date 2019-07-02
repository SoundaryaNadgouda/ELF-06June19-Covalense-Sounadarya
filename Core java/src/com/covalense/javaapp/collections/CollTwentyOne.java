package com.covalense.javaapp.collections;
import java.util.Enumeration;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class CollTwentyOne {

	public static void main(String[] args) {
		Vector  v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		log.info("using foe loop");
		for(int i=0;i<v.size();i++) {
			Object s=v.get(i);
			log.info(" "+s);
		
	}
		log.info("using for each loop");
		for(Object s:v) {
			log.info(" "+s);
		}
		log.info("using iterator");
		Iterator it=v.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			log.info(" "+r);
	}
		log.info("using listIterator");
		ListIterator lit=v.listIterator();
		while(lit.hasNext()) {
			Object r=lit.next();
			log.info(" "+r);
	}
		log.info("using reverse iterator");
		while(lit.hasPrevious()) {
			Object r=lit.previous();
			log.info(" "+r);
}
		log.info("using enumeration");
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Object  k=e.nextElement();
			log.info(" "+k);
		}
	}

}
