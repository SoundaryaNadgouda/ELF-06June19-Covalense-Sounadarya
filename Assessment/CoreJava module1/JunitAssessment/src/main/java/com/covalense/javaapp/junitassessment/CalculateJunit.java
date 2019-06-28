package com.covalense.javaapp.junitassessment;

import java.util.logging.Logger;

public class CalculateJunit {
		public static final Logger log=Logger.getLogger("CalculateTest");
		public double  calculateSimpleInterest(int p,int t,double r) {
			 return ((p*t*r)/100);
			}
		public int calculatePercentage(int m1,int m2,int m3,int total) {
			int sum=m1+m2+m3;
			return ((sum/total)*100);
		}
		public int calculateFact(int n) {
			int fa=1;
			for(int i=1;i<=n;i++) {
				
				fa=fa*i;
			}
			return fa;
		}
	}

