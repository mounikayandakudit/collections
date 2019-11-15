package com.training.collections;

/**
 * This java application is named as Television with attributes
 * company,type,enabled 3d,price
 * 
 * @author myandaku
 *
 */
public class Television {

	String company;
	String type;
	String enable3d;
	double price;

	/**
	 * Default constructor with no return type
	 */
	public Television() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterised constructor
	 * 
	 * @param company
	 * @param type
	 * @param enable3d
	 * @param price
	 */
	public Television(String company, String type, String enable3d, double price) {
		super();
		this.company = company;
		this.type = type;
		this.enable3d = enable3d;
		this.price = price;
	}

	/**
	 * This method is used to get hashcode
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/**
	 * This method is used tp check equality of the object
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
