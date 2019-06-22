package com.covalense.javaapp.array;

import java.util.logging.Logger;

interface Str {
	int string(String s);

}

public class LambdaExp {
	public static final Logger log=Logger.getLogger("LambdaExp");
	public static void main(String[] args) {
		Str st = s -> s.length();
		int i = st.string("abc");
		log.info("length is " + i);
	}

}
