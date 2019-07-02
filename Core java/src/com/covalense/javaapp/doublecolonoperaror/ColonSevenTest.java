package com.covalense.javaapp.doublecolonoperaror;
import lombok.extern.java.Log;
                                                  
@Log
public class ColonSevenTest {

	public static void main(String[] args) {
		ColonSeven o=ColonSevenProduct :: new;
		ColonSevenProduct o1=o.getProduct("Pen",30);
		log.info("product details are "+ o1.name+" "+o1.cost);
	}

}
