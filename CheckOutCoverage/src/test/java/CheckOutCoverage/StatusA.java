package CheckOutCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CheckOutCoverage.StatusClass.Status;

public class StatusA {
	@Test
	public void testAll() {
	    assertEquals(true, StatusClass.checkOut(3450,700,Status.gold));//1
	}

}
