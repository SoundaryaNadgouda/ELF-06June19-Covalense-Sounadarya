package com.covalense.javaapp.hasarelation;
import lombok.extern.java.Log;
@Log
public class MainNine {

	public static void main(String[] args) {
		College.s.play();
		College.s.name = "abc";
		log.info("name is " + College.s.name);

	}

}
