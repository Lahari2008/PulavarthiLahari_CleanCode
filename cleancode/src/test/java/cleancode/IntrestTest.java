package cleancode;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntrestTest {

	@Test
	public void testSimple_Interest() {
		Intrest object1=new Intrest();
		assertEquals(10500.00,object1.Simple_Interest(10000.00, 1,5.00),0);
	}

	@Test
	public void testCompound_Interest() {
		Intrest object2=new Intrest();
		assertEquals(10778.50,object2.Compound_Interest(10000.00,1,12,7.5),2);
	}

}