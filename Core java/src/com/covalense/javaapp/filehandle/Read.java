package com.covalense.javaapp.filehandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


import lombok.extern.java.Log;
@Log
public class Read {

	public static void main(String[] args) {

		FileInputStream fout=null;
		ObjectInputStream obj=null;
		
		try {
			fout=new FileInputStream("soundarya.txt");
			obj=new ObjectInputStream(fout);
			
			
			Person p=new Person();
			log.info(p.getName());
			log.info(" "+p.getId());
						
		} catch (FileNotFoundException e) {
		
		}catch(IOException e) {
			log.severe("hiii");
			
			}
		finally {
			if(obj!=null) {
				if(fout!=null)
				try {
					obj.close();
					fout.close();
				} catch (IOException e) {
					log.severe("hii");
				}
			}
		}
	}		

}
