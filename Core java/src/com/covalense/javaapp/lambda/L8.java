package com.covalense.javaapp.lambda;

import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
public class L8 {

	public static void main(String[] args) {
		StudentL8 c1=new StudentL8("soundarya",78,98,67);
		StudentL8 c2=new StudentL8("soujanya",89,56,54);
		Consumer<StudentL8> s=c->{
			double a=(c.m1+c.m2+c.m3);
			log.info(c.name +" scored "+a);
		};	
		s.accept(c1);
		s.accept(c2);
		
	}

}
