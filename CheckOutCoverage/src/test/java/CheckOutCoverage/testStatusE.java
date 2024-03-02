package CheckOutCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CheckOutCoverage.StatusClass.Status;

public class testStatusE {
	@Test
	public void testAll() {
	    assertEquals(true, StatusClass.checkOut(1000,900,Status.bronze)); //5
	}

}
