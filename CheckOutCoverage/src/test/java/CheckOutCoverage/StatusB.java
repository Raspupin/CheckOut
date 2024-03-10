package CheckOutCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CheckOutCoverage.StatusClass.Status;

public class StatusB {
	@Test
	public void testAll() {
	    assertEquals(true, StatusClass.checkOut(3600,700,Status.gold)); //2
	}

}
