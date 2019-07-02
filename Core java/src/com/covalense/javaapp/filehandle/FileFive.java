package com.covalense.javaapp.filehandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class FileFive {

	public static void main(String[] args) {
		FileInputStream fi=null;
		try {
			fi=new FileInputStream("new.txt");
			int i=fi.read();
			while(i != -1) {
				log.info((" "+(char)i));
			}
		}catch(FileNotFoundException e) {

			log.severe("file not found");
			}catch(IOException e) {
				log.severe("its exception");
			}
		finally {
			if(fi!=null) {
				try {
					fi.close();
				} catch (IOException e) {
					log.severe("hello");
				}
			}
		}
	}
}
