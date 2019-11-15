package com.training.collections;

/**
 * This java class is implemented with class name as carInstances
 * with attributes make,model,year,price
 * @author myandaku
 *
 */

public class CarInstances implements Comparable<CarInstances>{
	
	String make;
	String model;
	int year;
    double price;
    
    /*
	 * As below signature has the name as Class name and it doesn't contain any
	 * return value so it will be treated as Constructor of the class
	 */
    
    public CarInstances() {
		// TODO Auto-generated constructor stub
	}
    
    /*
	 * Parameterized constructor with four arguments, String,String,int and double
	 */
    
	public CarInstances(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
/**
 * this method is used to compare two objects by 
 * their name
 */

	@Override
	public 	int compareTo(CarInstances o) {
		// TODO Auto-generated method stub
	return this.make.compareTo(o.make);
				
	}

}
