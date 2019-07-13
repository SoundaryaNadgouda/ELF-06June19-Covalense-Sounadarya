package com.covalense.javaapp.assignmentsix;

import java.util.logging.Logger;

public class ObjCountMain {
	private static final Logger log = Logger.getLogger("ObjCountMain");

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ObjCount o1 = new ObjCount();
		ObjCount o2 = new ObjCount();
		ObjCount o3 = new ObjCount();
		ObjCount o4 = new ObjCount();

		log.info("Number of objects " + ObjCount.count);
	}

}
