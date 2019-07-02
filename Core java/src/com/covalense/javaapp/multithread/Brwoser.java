package com.covalense.javaapp.multithread;

public class Brwoser extends Thread{
	Pvr ref;

	public Brwoser(Pvr ref) {
		super();
		this.ref = ref;
	}
	@Override
	public void run() {
		ref.book();
	}
}
