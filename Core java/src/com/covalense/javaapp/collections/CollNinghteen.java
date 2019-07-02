package com.covalense.javaapp.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import lombok.extern.java.Log;
@Log
public class CollNinghteen {

	public static void main(String[] args) {
		LinkedList<Character> ll=new LinkedList<>();
		ll.add('s');
		ll.add('o');
		ll.add('u');
		ll.add('A');
		ll.add('N');
		
		log.info("using foe loop");
		for(int i=0;i<ll.size();i++) {
			Character s=ll.get(i);
			log.info(" "+s);
		
	}
		log.info("using for each loop");
		for(Character s:ll) {
			log.info(" "+s);
		}
		log.info("using iterator");
		Iterator<Character> it=ll.iterator();
		while(it.hasNext()) {
			Character r=it.next();
			log.info(" "+r);
	}
		log.info("using listIterator");
		ListIterator<Character> lit=ll.listIterator();
		while(lit.hasNext()) {
			Character r=lit.next();
			log.info(" "+r);
	}
		log.info("using reverse iterator");
		while(lit.hasPrevious()) {
			Character r=lit.previous();
			log.info(" "+r);
}
	}

}
