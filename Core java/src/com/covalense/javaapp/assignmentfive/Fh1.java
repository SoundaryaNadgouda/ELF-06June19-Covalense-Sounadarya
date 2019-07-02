package com.covalense.javaapp.assignmentfive;
import java.util.logging.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class Fh1 {
	private static final Logger log = Logger.getLogger("Pro8");
	public static void main(String[] args) {
		File file = new File("abc.txt");
		try {
			boolean res=file.createNewFile();
			log.info("res is "+res);
			log.info("done");
			FileWriter fr = new FileWriter(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}

	}



