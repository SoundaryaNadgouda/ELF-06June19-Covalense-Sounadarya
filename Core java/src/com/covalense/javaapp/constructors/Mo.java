package com.covalense.javaapp.constructors;
import lombok.extern.java.Log;
@Log
class M1 {
	void search(int i) {
		log.info(" "+i);
	}

	void search(String s) {
		log.info(s);
	}
}

class Mo {
	public static void main(String[] args) {
		M1 m = new M1();
		m.search(5);
		m.search("abc");
	}

}
