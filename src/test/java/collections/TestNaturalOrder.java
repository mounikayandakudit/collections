package collections;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Test;

public class TestNaturalOrder {

	/**
	 * This method checks whether set prints in sorted order or not
	 */
	@Test
	public void testToCheckNaturalOrder() {
		Set<String> set = new TreeSet<String>();
		set.add("mounika");
		set.add("sowmya");
		set.add("tarun");
		set.add("alekya");

		Iterator<String> it = set.iterator();

		assertEquals("alekya", it.next());
		assertEquals("mounika", it.next());
		assertEquals("sowmya", it.next());
		assertEquals("tarun", it.next());

	}

}
