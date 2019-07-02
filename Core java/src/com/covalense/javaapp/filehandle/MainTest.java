package com.covalense.javaapp.filehandle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import lombok.extern.java.Log;
@Log
public class MainTest {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("abc");
		p.setId(23);
		FileOutputStream fout=null;
		ObjectOutputStream obj=null;
		try {
			 fout=new FileOutputStream("soundarya.txt");
			obj=new ObjectOutputStream(fout);
			obj.writeObject(p);
			
			fout.close();
		} catch (FileNotFoundException e) {
			log.severe("file not found");
		}catch(IOException e) {
			log.severe("its exception");
			}
		finally {
			try {
				if(fout!=null) {
				fout.close();
				}
				if(obj!=null) {
				obj.close();
					}
			} catch (IOException e) {
				log.severe("its exception");
			}
			
			
		}
		
	}

}
