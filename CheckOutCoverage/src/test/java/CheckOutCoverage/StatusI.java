package CheckOutCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CheckOutCoverage.StatusClass.Status;

public class StatusI {
	@Test
	public void testAll() {
	    assertEquals(true, StatusClass.checkOut(800,800,Status.bronze)); //7
	}

}
