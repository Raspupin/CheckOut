package CheckOutCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CheckOutCoverage.StatusClass.Status;

public class StatusC {
	@Test
	public void testAll() {
	    assertEquals(false, StatusClass.checkOut(3600,600,Status.gold)); //3
	}

}
