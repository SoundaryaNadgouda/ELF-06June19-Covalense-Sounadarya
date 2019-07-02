package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import lombok.extern.java.Log;
@Log
public class CollEighteen {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(9.2);
		ll.add(1.5);
		ll.add(6.9);
		ll.add(2.4);
		ll.add(3.6);
		
		log.info("using foe loop");
		for(int i=0;i<ll.size();i++) {
			Object s=ll.get(i);
			log.info(" "+s);
		
	}
		log.info("using for each loop");
		for(Object s:ll) {
			log.info(" "+s);
		}
		log.info("using iterator");
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			log.info(" "+r);
	}
		log.info("using listIterator");
		ListIterator lit=ll.listIterator();
		while(lit.hasNext()) {
			Object r=lit.next();
			log.info(" "+r);
	}
		log.info("using reverse iterator");
		while(lit.hasPrevious()) {
			Object r=lit.previous();
			log.info(" "+r);
}
}
}
