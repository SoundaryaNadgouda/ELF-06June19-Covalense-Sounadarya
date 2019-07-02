package com.covalense.javaapp.multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;
@Log
public class PenMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Pen p=new Pen();
		
		FutureTask<Integer> f=new FutureTask<>(p);
		Thread t1=new Thread(f);
		t1.start();
		
		int i=f.get();
		
		log.info(" "+i);
		
		
	}

}
