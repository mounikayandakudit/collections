package collections;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.training.collections.Car;
import com.training.collections.Laptop;
import com.training.collections.Mobile;
import com.training.collections.School;
import com.training.collections.Television;

public class TestCollection {

	/**
	 * This method checks the equality method
	 * 
	 */

	@Test
	public void toTestTheElementsAreEqualForLaptop() {

		Laptop hp = new Laptop("HP", "L480", "WINDOWS", "32BIT");
		Laptop dell = new Laptop("HP", "L480", "LINUX", "64BIT");
		Laptop mac = new Laptop("MAC", "PRO", "UNIX", "32BIT");
		Set<Laptop> laptopList = new HashSet<Laptop>();
		laptopList.add(hp);
		laptopList.add(dell);
		laptopList.add(mac);

		assertEquals(2, laptopList.size());
	}

	/**
	 * This method checks the equality method
	 * 
	 */
	@Test
	public void toTestTheElementsAreEqualForMobile() {
		Mobile samsung = new Mobile("samsung", "corei3", "old model", "snapdragon", 10000.0);
		Mobile mi = new Mobile("mi", "note 5", "new feature", "kitkat", 14000.0);
		Mobile lenovo = new Mobile("samsung", "corei3", "low cost", "snapdragon", 6000.0);
		Set<Mobile> mobile = new HashSet<Mobile>();

		mobile.add(samsung);
		mobile.add(mi);
		mobile.add(lenovo);

		assertEquals(2, mobile.size());
	}

	/**
	 * This method checks the equality method
	 * 
	 */

	@Test
	public void toTestElementsAreEqualForSchool() {
		School oxford = new School("oxford", "Hyd", "Telangana", 1);
		School euro = new School("euro", "Mumbai", "airoli", 2);
		School Santiniketan = new School("oxford", "Hyd", "Telangana", 3);
		Set<School> list = new HashSet<School>();
		list.add(oxford);
		list.add(euro);
		list.add(Santiniketan);
		assertEquals(2, list.size());
	}

	/**
	 * This method checks the equality method
	 * 
	 */

	@Test
	public void toTestElementsAreEqualTelevision() {
		Television sony = new Television("sony", "LCD", "Enabled", 30000.0);
		Television samsung = new Television("samsung", "LED", "NotEnabled", 40000.0);
		Television onida = new Television("sony", "LCD", "Enabled", 30000.0);
		Set<Television> list = new HashSet<Television>();
		list.add(sony);
		list.add(samsung);
		list.add(onida);
		assertEquals(2, list.size());
	}

	/**
	 * This method checks the equality method
	 * 
	 */
	@Test
	public void toTestElementsAreEqualCar() {
		Car maruti = new Car("Maruti", "celerio", 2017, 300000.0);
		Car hyundai = new Car("Hyundai", "i20", 2016, 400000.0);
		Car honda = new Car("Maruti", "celerio", 2014, 700000.0);
		Set<Car> list = new HashSet<Car>();
		list.add(maruti);
		list.add(hyundai);
		list.add(honda);
		assertEquals(2, list.size());
	}

}
