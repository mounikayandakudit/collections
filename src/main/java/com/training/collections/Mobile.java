package com.training.collections;

/**
 * This java class is implemented with class name mobile with attributes
 * company,model,description,os,price
 * 
 * @author myandaku
 *
 */
public class Mobile {

	String company;
	String model;
	String description;
	String os;
	double price;

	/*
	 * As below signature has the name as Class name and it doesn't contain any
	 * return value so it will be treated as Constructor of the class
	 */
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param company
	 * @param model
	 * @param description
	 * @param os
	 * @param price
	 */
	public Mobile(String company, String model, String description, String os, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.os = os;
		this.price = price;
	}

	/**
	 * This method is used to calculate hashcode
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		return result;
	}

	/**
	 * This method is used to check equality between the objects
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		return true;
	}

}
