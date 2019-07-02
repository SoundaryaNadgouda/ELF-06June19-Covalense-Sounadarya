package com.covalense.javaapp.implementlambda;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class WriteData {
	public static void main(String[] args) {
		
	String msg="hello ";
	byte []b=msg.getBytes();
	try (FileOutputStream	fout=new FileOutputStream("an.txt",true)) {
		
		fout.write(b);
		log.info(" print string");
	}catch(FileNotFoundException e) {
		log.severe("file not found" );
	}catch(IOException e) {
		log.severe(" its exception");
	}
}
}
	