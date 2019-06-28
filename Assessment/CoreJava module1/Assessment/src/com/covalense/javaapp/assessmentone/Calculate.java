package com.covalense.javaapp.assessmentone;

public class Calculate {
	double calculateSimpleInterest(int p,int t,double r) {
		return  (p*t*r)/100;
		}
	double calculatePercentage(int m1,double m2,int m3,int total) {
		double sum=m1+m2+m3;
		return (sum/total)*100;
	}
	int calculateFact(int n) {
		int fa=1;
		for(int i=1;i<=n;i++) {
			
			fa=fa*i;
		}
		return fa;
	}
}