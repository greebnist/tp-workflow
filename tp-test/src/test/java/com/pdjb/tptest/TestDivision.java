package test.java.com.pdjb.tptest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.com.pdjb.tptest.Division;

public class TestDivision {
	@Test
	 public final void testDivision() {
		Division division = new Division();
		assertTrue(division.divide(6,2) == 3);
 }
}
