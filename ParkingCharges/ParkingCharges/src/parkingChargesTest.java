import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class parkingChargesTest {

	ParkingCharges car1;
	ParkingCharges car2;
	ParkingCharges car3;
	@Before
	public void setUp() throws Exception 
	{
		car1 = new ParkingCharges(2);
		car2 = new ParkingCharges(7);
		car3 = new ParkingCharges(25);
	}

	@After
	public void tearDown() throws Exception 
	{
		car1 = car2 = null;
	}

	@Test
	public void testCalcParkingCharges() {
		
		assertEquals(2, car1.calcParkingCharges(), .001);
		assertEquals(4, car2.calcParkingCharges(), .001);
		assertEquals(10, car3.calcParkingCharges(), .001);
	}
	

}
