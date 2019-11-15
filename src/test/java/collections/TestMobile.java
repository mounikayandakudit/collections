package collections;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.training.collections.Car;
import com.training.collections.Mobile;

public class TestMobile {

	/**
	 * This method checks Whether the elements printed or not
	 */
	@Test
	public void testToPrintTheElements() {

		Mobile samsung = new Mobile("samsung", "corei3", "old model", "snapdragon", 10000.0);
		Mobile mi = new Mobile("mi", "note 5", "new feature", "kitkat", 14000.0);
		Mobile lenovo = new Mobile("lenovo", "a7", "low cost", "snapdragon", 6000.0);
		List<Mobile> list = new ArrayList<Mobile>();

		list.add(samsung);
		list.add(mi);
		list.add(lenovo);

		Iterator it = list.iterator();
		assertEquals(samsung, it.next());
		assertEquals(mi, it.next());
		assertEquals(lenovo, it.next());

	}

}
