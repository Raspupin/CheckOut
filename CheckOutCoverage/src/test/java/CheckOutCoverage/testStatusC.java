package CheckOutCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CheckOutCoverage.StatusClass.Status;

public class testStatusC {
	@Test
	public void testAll() {
	    assertEquals(true, StatusClass.checkOut(2000,800,Status.silver)); //3
	}

}
