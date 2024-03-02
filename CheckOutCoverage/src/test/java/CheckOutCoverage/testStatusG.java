package CheckOutCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CheckOutCoverage.StatusClass.Status;

public class testStatusG {
	@Test
	public void testAll() {
	    assertEquals(false, StatusClass.checkOut(2000,700,Status.bronze)); //7
	}

}
