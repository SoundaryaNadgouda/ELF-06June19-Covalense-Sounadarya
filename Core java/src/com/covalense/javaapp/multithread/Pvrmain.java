package com.covalense.javaapp.multithread;

public class Pvrmain {

	public static void main(String[] args) {
		Pvr p=new Pvr();
		Brwoser b1=new Brwoser(p);
		b1.start();
		
		Brwoser b2=new Brwoser(p);
		b2.start();
		
		Brwoser b3=new Brwoser(p);
		b3.start();
		
		p.leaveMe();
		
	}

}
