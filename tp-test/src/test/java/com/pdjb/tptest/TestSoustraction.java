package test.java.com.pdjb.tptest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import main.java.com.pdjb.tptest.Soustraction;

public class TestSoustraction {
	
	@Test
	public final void testSubstract() {
		assertTrue(Soustraction.Substract(2,2) == 0);
	}

}
