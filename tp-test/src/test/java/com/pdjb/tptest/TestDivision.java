package com.pdjb.tptest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDivision {
	@Test
	 public final void testDivision() {
		Division division = new Division();
		assertTrue(division.divide(6,2) == 3);
 }
}
