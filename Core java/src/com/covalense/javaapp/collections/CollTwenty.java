package com.covalense.javaapp.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import lombok.extern.java.Log;
@Log
public class CollTwenty {

	public static void main(String[] args) {
		Vector <Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		log.info("using foe loop");
		for(int i=0;i<v.size();i++) {
			Integer s=v.get(i);
			log.info(" "+s);
		
	}
		log.info("using for each loop");
		for(Integer s:v) {
			log.info(" "+s);
		}
		log.info("using iterator");
		Iterator<Integer> it=v.iterator();
		while(it.hasNext()) {
			Integer r=it.next();
			log.info(" "+r);
	}
		log.info("using listIterator");
		ListIterator<Integer> lit=v.listIterator();
		while(lit.hasNext()) {
			Integer r=lit.next();
			log.info(" "+r);
	}
		log.info("using reverse iterator");
		while(lit.hasPrevious()) {
			Integer r=lit.previous();
			log.info(" "+r);
}	
		log.info("using enumeration");
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements()) {
			Integer k=e.nextElement();
			log.info(" "+k);
		}
	}

}
