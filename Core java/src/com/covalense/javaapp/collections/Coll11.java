package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;
@Log
public class Coll11 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("abc");
		al.add("mno");
		al.add("xyz");
		al.add("soundarya");
		
		Iterator <String>it=al.iterator();
		while(it.hasNext()) {
			String r=it.next();
			log.info(r);
	}
	}
}
