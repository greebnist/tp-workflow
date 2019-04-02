package test.java.com.pdjb.tptest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import main.java.com.pdjb.tptest.Substraction;

public class TestSubstraction {
	
	@Test
	public final void testSubstract() {
		assertTrue(Substraction.substract(2,2) == 0);
	}
	
	@Test
	public final void testSubstractNegative() {
		assertTrue(Substraction.substract(-1,0) == -1);
	}

}
