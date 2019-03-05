package test.java.com.pdjb.tptest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import main.java.com.pdjb.tptest.Addition;

public class TestAddition {
	
	@Test
	public final void testadd() {
		assertTrue(Addition.add(2,2) == 4);
	}
}
