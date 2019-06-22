package com.covalense.javaapp.collections;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class Coll10 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("mno");
		al.add("abc");
		al.add("pqr");
		al.add("xyz");
		
		for(int i=0;i<al.size();i++) {
			String s=al.get(i);
			log.info(s);
			
		}
	}

}
