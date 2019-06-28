package com.covalense.javaapp.junitassessmenttest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.covalense.javaapp.junitassessment.CalculateJunit;

public class CalculateTest {

	CalculateJunit ct=new  CalculateJunit();
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSimpleInterest() {
		double actual=ct.calculateSimpleInterest(1000, 2, 2.5);
		double expected=50.0;
		
		assertEquals(expected, actual,0.01);
	}
	
	@Test
	public void testPercentage() {
		int actual=ct.calculatePercentage(60, 34, 35, 100);
		int expected=100;
     assertEquals(expected, actual);		
	}	
	@Test
	public void testFact() {
		int actual=ct.calculateFact(5);
		int expected=120;
		
		assertEquals(expected, actual);
	}		

}
