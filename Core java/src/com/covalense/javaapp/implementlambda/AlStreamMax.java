package com.covalense.javaapp.implementlambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;
@Log
public class AlStreamMax {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(4);
		al.add(0);
		al.add(1);
		al.add(5);
		al.add(2);
		
		Comparator<Integer> c=(i,j)->i.compareTo(j);
		
		Integer minValue=al.stream().max(c).get();	
			log.info(" "+minValue);
	}
	}


