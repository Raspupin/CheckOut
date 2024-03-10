package CheckOutCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CheckOutCoverage.StatusClass.Status;

public class StatusF {
	@Test
	public void testAll() {
	    assertEquals(true, StatusClass.checkOut(4600,800,Status.silver)); //6
	}

}
