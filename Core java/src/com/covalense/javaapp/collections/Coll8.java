package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;
import lombok.extern.java.Log;
@Log
public class Coll8 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(58);
		al.add(67);
		al.add(78);
		
		Iterator <Integer>it=al.iterator();
		while(it.hasNext()) {
			Integer r=it.next();
			log.info(" "+r);
	}
	}
}
