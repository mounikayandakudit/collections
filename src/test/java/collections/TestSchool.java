package collections;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.training.collections.School;

public class TestSchool {

	/**
	 * This method checks Whether the elements printed or not
	 */
	@Test
	public void testToPrintElements() {

		School oxford = new School("oxford", "Hyd", "Telangana", 1);
		School euro = new School("euro", "Mumbai", "airoli", 2);
		School Santiniketan = new School("santiniketan", "rjy", "Egdt", 3);
		List<School> list = new ArrayList<School>();
		list.add(oxford);
		list.add(euro);
		list.add(Santiniketan);
		Iterator it = list.iterator();
		assertEquals(oxford, it.next());
		assertEquals(euro, it.next());
		assertEquals(Santiniketan, it.next());

	}

}
