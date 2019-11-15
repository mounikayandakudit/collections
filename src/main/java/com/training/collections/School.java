package com.training.collections;

/**
 * This java application is named as school with attributes
 * name,city,district,greatschoolranking
 * 
 * @author myandaku
 *
 */
public class School {
	String name;
	String city;
	String district;
	int greatScoolRanking;

	/**
	 * Default constructor which has no return type
	 */
	public School() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized cONSTRUCTOR
	 * 
	 * @param name
	 * @param city
	 * @param district
	 * @param greatScoolRanking
	 */

	public School(String name, String city, String district, int greatScoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.greatScoolRanking = greatScoolRanking;
	}

	/**
	 * This method is used to get hashcode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * This method is used to check equality of the objects
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
