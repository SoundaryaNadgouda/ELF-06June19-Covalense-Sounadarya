package com.covalense.javaapp.objectclass;

public class MyArrayClass {
	private Object[] myArray;
	private int index = 0;

	public MyArrayClass(int size) {
		super();
		if (size < 0) {
			throw new ArrayIndexOutOfBoundsException("size should not be zero ");
		}
		myArray = new Object[size];

	}

	public MyArrayClass() {

		this(10);
	}

	public void add(Object val) {
		if (index > myArray.length) {
			Object[] myArray1 = new Object[20];
			System.arraycopy(myArray, 0, myArray1, 0, myArray.length);
			myArray = myArray1;
		}
		myArray[index] = val;
		index++;
	}

	public Object get(int pos) {
		return myArray[pos];
	}

	public int getSize() {
		return index - 1;
	}

	public void remove(int pos) {
		/*
		 * i=pos;i<myArray.length-1;i++) { myArray[i]=myArray[i+1];
		 */
		for (int i = 0; i < myArray.length - 1; i++) {
			System.arraycopy(myArray, pos + 1, myArray, pos, myArray.length - 1 - pos);
		}

	}

}
