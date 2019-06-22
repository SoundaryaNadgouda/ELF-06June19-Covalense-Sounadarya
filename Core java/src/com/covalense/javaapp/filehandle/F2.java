package com.covalense.javaapp.filehandle;

import java.io.File;
import lombok.extern.java.Log;
@Log
public class F2 {

	public static void main(String[] args) {
		File f1=new File("xyz");
		
			boolean res=f1.mkdirs();
			log.info("result is "+res);
	}

}
