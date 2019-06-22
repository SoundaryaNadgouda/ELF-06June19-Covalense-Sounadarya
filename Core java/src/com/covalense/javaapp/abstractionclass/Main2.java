package com.covalense.javaapp.abstractionclass;

public class Main2 {

	public static void main(String[] args) {
		Browser b = new Browser();
		Gd g1 = new Gd();
		Goo g = new Gmail();
		b.open(g1);
		g.shareDoc();

	}

}
