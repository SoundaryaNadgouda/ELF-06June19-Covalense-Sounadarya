package com.covalense.javaapp.collections;

public class Car implements  Comparable<Car>{
	String name;
	String brand;
	int cost;
	double rating;
	

	public int compareTo(Car c) {
		String a=this.name;
		String b=c.name;
		
		return a.compareTo(b);
				
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + cost;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand)) {
			return false;
		}
		if (cost != other.cost)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name)) {
			return false;
		}
		return  (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating)) ;
	}                                                                   
}
	
