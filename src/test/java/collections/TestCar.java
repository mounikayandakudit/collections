package collections;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.training.collections.Car;
import com.training.collections.Laptop;

public class TestCar {
	
	/**
	 * This method checks Whether the elements printed 
	 * or not
	 */
	
	@Test
	public void testToPrintTheElements() {
		
		Car maruti = new Car("Maruti","celerio",2017,300000.0);
		Car hyundai = new Car("Hyundai","i20",2016,400000.0);
		Car honda = new Car("Honda","HondaCity",2014,700000.0);
		List<Car> list = new ArrayList<Car>();
		list.add(maruti);
		list.add(hyundai);
		list.add(honda);
		
		Iterator it = list.iterator();
		assertEquals(maruti,it.next());
		assertEquals(hyundai,it.next());
		assertEquals(honda,it.next());
		
		
		
	}

}
