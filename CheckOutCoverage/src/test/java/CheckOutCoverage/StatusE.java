package CheckOutCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CheckOutCoverage.StatusClass.Status;

public class StatusE {
	@Test
	public void testAll() {
	    //assertEquals(true, StatusClass.checkOut(3600,900,Status.silver)); //5
		assertEquals(true, StatusClass.checkOut(3600,900,Status.bronze));
	}

}
