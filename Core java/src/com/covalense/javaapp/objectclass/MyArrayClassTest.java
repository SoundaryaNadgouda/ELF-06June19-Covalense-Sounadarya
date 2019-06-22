package com.covalense.javaapp.objectclass;

import java.util.logging.Logger;

public class MyArrayClassTest {
	
	public static final Logger log=Logger.getLogger("MainArr");
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		int n=10;
		MyArrayClass m=new MyArrayClass();
		for(int i=0;i<n;i++) {
			m.add("value is "+i);
		}
		 
		log.info("display content");
		
		log.info("removing 2nd position");
	
		m.remove(2);
		
		
		for(int i=0;i<n;i++) {
			log.info("output is "+m.get(i));
		}
		long endTime=System.currentTimeMillis();
		log.info(" total time "+(endTime-startTime)+"ms");
		
		
		

}
}
