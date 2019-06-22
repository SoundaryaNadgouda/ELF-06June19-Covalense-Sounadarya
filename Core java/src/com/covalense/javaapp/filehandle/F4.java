package com.covalense.javaapp.filehandle;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


import lombok.extern.java.Log;
@Log
public class F4 {

	public static void main(String[] args) {
		String msg="ding ding diga";
		char []c=msg.toCharArray();
		FileWriter fr=null;
		try {
			fr=new FileWriter("new.txt");
			fr.write(c);
			fr.flush();
			log.info("done...");
		}catch(FileNotFoundException e) {
			log.severe(" file not found");
		}catch(IOException e) {
			log.severe("its exception");
	}
		finally {
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					log.severe("hello");
				}
			}
		}
	}
}
