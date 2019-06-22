package com.covalense.javaapp.collections;
import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class Coll2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(58.6);
		al.add("abc");
		al.add("mn");
		
		for(Object r:al) {
			log.info(" "+r);
		
	}
	}
}
