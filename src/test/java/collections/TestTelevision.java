package collections;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.training.collections.Mobile;
import com.training.collections.Television;

public class TestTelevision {

	/**
	 * This method checks Whether the elements printed or not
	 */
	@Test
	public void testToPrintElements() {

		Television sony = new Television("sony", "LCD", "Enabled", 30000.0);
		Television samsung = new Television("samsung", "LED", "NotEnabled", 40000.0);
		Television onida = new Television("onida", "LED", "Enabled", 70000.0);
		List<Television> list = new ArrayList<Television>();
		list.add(sony);
		list.add(samsung);
		list.add(onida);
		Iterator it = list.iterator();
		assertEquals(sony, it.next());
		assertEquals(samsung, it.next());
		assertEquals(onida, it.next());

	}

}
