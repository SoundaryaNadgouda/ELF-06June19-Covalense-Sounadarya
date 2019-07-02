package com.covalense.javaapp.implementlambda;
import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class TestForEach {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(3);
		al.add(9);
		al.add(5);
		al.add(1);
		al.add(7);
		
		al.stream().forEach(System.out::println);
	}

}
