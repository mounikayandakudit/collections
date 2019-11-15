package com.training.collections;

import java.util.ArrayList;

import java.util.List;

/**
 * This java class is implemented with class name Laptop wit attributes
 * company,model,operating system,processor
 * 
 * @author myandaku
 *
 */

public class Laptop {
	String company;
	String model;
	String operatingSystem;
	String processor;

	/*
	 * As below signature has the name as Class name and it doesn't contain any
	 * return value so it will be treated as Constructor of the class
	 */

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * parameterized constructor
	 * 
	 * @param company
	 * @param model
	 * @param operatingSystem
	 * @param processor
	 */
	public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	/**
	 * 
	 * This method is used to get the hashcode of the object
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	/**
	 * This method is used to check the equality of two objects
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", processor=" + processor + "]";
	}

}
