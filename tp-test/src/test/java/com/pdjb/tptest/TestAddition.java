package com.pdjb.tptest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.pdjb.tptest.Addition;

public class TestAddition {
	
	@Test
	public final void testAdd() {
		assertTrue(Addition.add(2,2) == 4);
	}
}
