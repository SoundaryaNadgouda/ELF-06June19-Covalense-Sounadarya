package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.ListIterator;
import lombok.extern.java.Log;
@Log
public class CollNine {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("abc");
		al.add("xyz");
		al.add("mno");
		al.add("pqr");
		
		ListIterator <String>lit=al.listIterator(al.size());
			while(lit.hasNext()) {
					String r=lit.next();
					log.info(" "+r);
			}
					while(lit.hasPrevious()) {
						String r=lit.previous();
				log.info(" "+r);
	}
	}
}
