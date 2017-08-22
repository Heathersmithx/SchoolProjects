import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class parkingChargesTest {

	ParkingCharges car1;
	ParkingCharges car2;
	@Before
	public void setUp() throws Exception 
	{
		car1 = new ParkingCharges(5.0);
		car2 = new ParkingCharges(6.0);
	}

	@After
	public void tearDown() throws Exception 
	{
		car1 = car2 = null;
	}

	@Test
	public void testCalcParkingCharges() {
		//fail("Not yet implemented");
		assertEquals(3.00, car1.getTotalCost(), .001);
	}
	

}
