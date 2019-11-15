package com.training.collections;

/**
 * The java program with class name car it has attributes like
 * make,model,year,price This application implements to check the equality
 * between strings
 * 
 * @author myandaku
 *
 */
public class Car {

	String make;
	String model;
	int year;
	double price;

	/*
	 * As below signature has the name as Class name and it doesn't contain any
	 * return value so it will be treated as Constructor of the class
	 */

	public Car() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * Parameterized constructor with four arguments, String,String,int and double
	 */
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	/**
	 * this method returns the hashcode of the object
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	/**
	 * This method compares the equality of the current object with the object of
	 * same type
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

}
