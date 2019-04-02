package com.pdjb.tptest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.pdjb.tptest.Substraction;;

public class TestSubstraction {
	
	@Test
	public final void testSubstract() {
		assertTrue(Substraction.substract(2,2) == 0);
	}

}
