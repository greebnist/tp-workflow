package com.pdjb.tptest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.pdjb.tptest.Addition;

public class TestAddition {
	
	@Test
	public final void testAddPositive() {
		assertTrue(Addition.add(2,2) == 4);
	}
	
	@Test
	public final void testAddNegative() {
		assertTrue(Addition.add(-1,2) == 1);
	}
	
	@Test
	public final void testAddNegative2() {
		assertTrue(Addition.add(2,-1) == 1);
	}
	
	@Test
	public final void testAddZero() {
		assertTrue(Addition.add(0,2) == 2);
	}
	
	@Test
	public final void testAddZeroNegative() {
		assertTrue(Addition.add(0,-1) == -1);
	}
	
	
	@Test
	public final void testAddZeroPositive() {
		assertTrue(Addition.add(0,2) == 2);
	}
	
	@Test
	public final void testAddZeroNegative2() {
		assertTrue(Addition.add(-1,0) == -1);
	}
}
