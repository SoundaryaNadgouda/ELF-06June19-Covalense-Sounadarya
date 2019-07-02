package com.covalense.javaapp.filehandle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class FileThree {

	public static void main(String[] args) {
		String msg="how i wonder ";
		byte []b=msg.getBytes();
		FileOutputStream fout=null;
		try {
			fout=new FileOutputStream("myfile.txt",true);
			fout.write(b);
			log.info("data is written into file");
		}catch(FileNotFoundException e) {
			log.severe("file not found" );
		}catch(IOException e) {
			log.severe(" its exception");
		}
		finally {
			try {
				if(fout!=null) {
				fout.close();
				}
			} catch (IOException e) {
				log.severe("hello");
			}
		}
	}
}
