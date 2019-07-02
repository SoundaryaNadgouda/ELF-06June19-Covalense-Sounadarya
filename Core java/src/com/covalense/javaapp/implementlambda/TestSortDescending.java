package com.covalense.javaapp.implementlambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;
@Log
public class TestSortDescending {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(3);
		al.add(9);
		al.add(5);
		al.add(1);
		al.add(7);
		
		Comparator<Integer> c=(i,j)->i.compareTo(j)*-1;
		Stream<Integer> s=al.stream().sorted(c);	
	List<Integer> l=	s.collect(Collectors.toList());
		log.info(" "+l);
	}

}
