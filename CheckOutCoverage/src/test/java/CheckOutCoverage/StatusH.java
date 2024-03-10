package CheckOutCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CheckOutCoverage.StatusClass.Status;

public class StatusH {
	@Test
	public void testAll() {
	    assertEquals(false, StatusClass.checkOut(4000,600,Status.silver)); //7
	}

}
