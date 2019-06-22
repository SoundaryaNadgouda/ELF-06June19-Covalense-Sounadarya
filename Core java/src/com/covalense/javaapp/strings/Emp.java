package com.covalense.javaapp.strings;

public class Emp {
	private final int age;
	private final String name;
	private final int sal;
	private final String gender;

	public Emp(int age, String name, int sal, String gender) {
		super();
		this.age = age;
		this.name = name;
		this.sal = sal;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getSal() {
		return sal;
	}

	public String getGender() {
		return gender;
	}

}
