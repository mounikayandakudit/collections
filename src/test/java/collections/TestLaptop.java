package collections;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.training.collections.Laptop;

public class TestLaptop {

	/**
	 * This method checks Whether the elements printed or not
	 */

	@Test
	public void toCheckElementsPrintedOrNot() {
		List<Laptop> laptopList = new ArrayList<Laptop>();
		Laptop hp = new Laptop("HP", "L480", "WINDOWS", "32BIT");
		Laptop dell = new Laptop("DELL", "L460", "LINUX", "64BIT");
		Laptop mac = new Laptop("MAC", "PRO", "UNIX", "32BIT");
		laptopList.add(hp);
		laptopList.add(dell);
		laptopList.add(mac);

		Iterator it = laptopList.iterator();
		assertEquals(hp, it.next());
		assertEquals(dell, it.next());
		assertEquals(mac, it.next());

	}

	@Test
	public void testToPrintAllValuesOfLaptop() {

	}
}