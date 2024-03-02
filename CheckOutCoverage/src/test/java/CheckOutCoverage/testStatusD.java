package CheckOutCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CheckOutCoverage.StatusClass.Status;

public class testStatusD {
	@Test
	public void testAll() {
	    assertEquals(true, StatusClass.checkOut(3000,800,Status.silver)); //4
	}

}
