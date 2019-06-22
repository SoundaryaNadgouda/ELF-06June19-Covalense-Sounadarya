package com.covalense.javaapp.collections;

import java.util.ArrayList;
import lombok.extern.java.Log;
@Log
public class Coll7 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("mno");
		al.add("abc");
		al.add("pqr");
		al.add("xyz");
		
		for(String i:al) {
	log.info(" "+i);
		}
	}

}
