package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.ListIterator;
import lombok.extern.java.Log;
@Log
public class CollFour {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(58.6);
		al.add("abc");
		al.add("mn");
		
		ListIterator lit=al.listIterator(al.size());
			while(lit.hasPrevious()) {
				Object r=lit.previous();
			log.info(" "+r);
	}
	}
}

