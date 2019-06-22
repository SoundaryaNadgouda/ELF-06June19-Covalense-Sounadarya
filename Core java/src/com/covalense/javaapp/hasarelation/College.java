package com.covalense.javaapp.hasarelation;
import lombok.extern.java.Log;
@Log
public class College {
	static Stu s = new Stu();

	void teach() {
		log.info("teaching");
	}
}
