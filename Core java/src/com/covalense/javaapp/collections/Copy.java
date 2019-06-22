package com.covalense.javaapp.collections;
import lombok.extern.java.Log;
@Log
public class Copy {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		 int []b= {10,20,30,40,50,60,70};
		  	
		  	System.arraycopy(a, 2, b, 3, 2);
		  	
		  	for(int i=0;i<b.length;i++) {
		  	log.info(" "+b[i]);
		  	}
}
}
