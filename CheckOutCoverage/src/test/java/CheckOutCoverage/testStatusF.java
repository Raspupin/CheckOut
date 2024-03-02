package CheckOutCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CheckOutCoverage.StatusClass.Status;

public class testStatusF {
	@Test
	public void testAll() {
	    assertEquals(true, StatusClass.checkOut(2000,900,Status.bronze)); //6
	}

}
