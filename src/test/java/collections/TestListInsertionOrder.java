package collections;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.training.collections.Laptop;

public class TestListInsertionOrder {

	/**
	 * This method checks list prints in insertion order or not
	 */
	@Test
	public void testIfTheListIsPrintingInInsertionOrder() {
		List<String> list = new ArrayList<String>();
		list.add("mounika");
		list.add("maheswari");
		list.add("alekya");
		list.add("sowmya");
		list.add("tarun");

		Iterator it = list.iterator();
		assertEquals("mounika", it.next());
		assertEquals("maheswari", it.next());
		assertEquals("alekya", it.next());
		assertEquals("sowmya", it.next());
		assertEquals("tarun", it.next());

	}

}
