package com.covalense.javaapp.assignmentfive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/*
 * wap to append the content of file1 to content of file2
 */
public class Fh2 {
	public static final Logger log = Logger.getLogger("Fh2");

	public static void main(String[] args) {
		InputStream fin = null;
		OutputStream fout = null;

		File f1 = new File("abc.txt");
		File f2 = new File("destination.txt");

		try {

			fin = new FileInputStream(f1);
			fout = new FileOutputStream(f2);
			byte[] b = new byte[1024];
			int length;
			while ((length = fin.read(b)) > 0) {
				fout.write(b, 0, length);
			}
			if (fin != null)
				fin.close();
			if (fout != null)
				fout.close();

		} catch (FileNotFoundException e) {
			log.severe("File not found exception");
		} catch (IOException e) {
			log.severe("IO exception");
		}

	}

}
