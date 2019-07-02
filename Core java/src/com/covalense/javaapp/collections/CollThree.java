package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;
import lombok.extern.java.Log;
@Log
public class CollThree {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(58.6);
		al.add("abc");
		al.add("mn");
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			log.info(" "+r);
		}
		
	}

}
