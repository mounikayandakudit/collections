package collections;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestStudent {
	/**
	 * This method checks Whether the elements printed or not
	 */
	@Test
	public void testToGetFruitByName() {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("jay", "mango");
		map.put("ram", "banana");
		map.put("sita", "guava");
		map.get("jay");
		assertEquals("mango", map.get("jay"));
		assertEquals("banana", map.get("ram"));
		assertEquals("guava", map.get("sita"));

	}

}
