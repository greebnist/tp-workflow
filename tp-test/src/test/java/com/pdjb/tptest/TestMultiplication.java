package com.pdjb.tptest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.pdjb.tptest.Multiplication;

public class TestMultiplication {

	@Test
	 public final void testMultiplication() {
		 Multiplication multiplication = new Multiplication();
        assertTrue(multiplication.multiply(2,2) == 4);
  }
}
