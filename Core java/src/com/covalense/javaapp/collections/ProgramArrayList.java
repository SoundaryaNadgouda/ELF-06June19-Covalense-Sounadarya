package com.covalense.javaapp.collections;

import java.util.ArrayList;
import lombok.extern.java.Log;
@Log
public class ProgramArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(50);
		al.add(70);
		al.add(80);
		
		for(int i=0;i<4;i++) {
			Object r=al.get(i);
		log.info(" "+r);
		}
		
	}

}
