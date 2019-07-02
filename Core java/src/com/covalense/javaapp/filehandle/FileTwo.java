package com.covalense.javaapp.filehandle;

import java.io.File;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class FileTwo {

	public static void main(String[] args) {
		File f=new File("M:/abc.txt"); //M is not existing in this system
		try {
			boolean res=f.createNewFile();
			log.info("result is "+res);
			log.info("done");
		} catch (IOException e) {
			log.severe("its exception");
		}
		
	}

}
