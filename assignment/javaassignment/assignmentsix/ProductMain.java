package com.covalense.javaapp.assignmentsix;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ProductMain {
	private static final Logger log = Logger.getLogger("ProductMain");

	public static void main(String[] args) {
		ArrayList<ProductBean> al = new ArrayList<ProductBean>();
		ProductBean p1 = new ProductBean("abc", 3000, 3.5);
		ProductBean p2 = new ProductBean("mno", 1000, 4.5);
		ProductBean p3 = new ProductBean("pqr", 4000, 5.5);
		ProductBean p4 = new ProductBean("stu", 500, 2.5);
		ProductBean p5 = new ProductBean("xyz", 5000, 1.5);

		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);

		for (ProductBean p : al) {
			if (p.getCost() < 2000) {
				log.info("Name is " + p.getName());
				log.info("Cost is " + p.getCost());
				log.info("Rating is " + p.getRating());
				log.info("----------------------------------------------");
			}

		}

	}

}
