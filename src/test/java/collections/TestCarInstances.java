package collections;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.training.collections.Car;
import com.training.collections.CarInstances;

public class TestCarInstances {
	
	@Test
	public void testToSortByPrice() {
		
		CarInstances maruti = new CarInstances("Maruti","celerio",2017,900000.0);
		CarInstances hyundai = new CarInstances("Renoault","i20",2016,800000.0);
		CarInstances honda = new CarInstances("Honda","HondaCity",2014,1000000.0);
		List<CarInstances> list = new ArrayList<CarInstances>();
		list.add(maruti);
		list.add(hyundai);
		list.add(honda);
		Collections.sort(list);
		Iterator<CarInstances> it = list.iterator();
		assertEquals(honda,it.next());
		assertEquals(maruti,it.next());
		assertEquals(hyundai,it.next());
	}

}
