package com.covalense.javaapp.assignmentfive;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class RadWriteFile {

	private static final Logger log = Logger.getLogger("bhavani");

	public static void main(String[] args) {
		String msg = "ding ding diganna";
		char ch[] = msg.toCharArray();
		try {
			FileWriter fout = new FileWriter("mno.txt", true);
			
			fout.write(ch);
			fout.flush();
			fout.close();
			log.info("data is write into file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
