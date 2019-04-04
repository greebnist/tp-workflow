package com.pdjb.tptest;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;

import org.junit.Test;

import com.pdjb.tptest.Multiplication;

public class TestMultiplication {

	@Test
	public final void testMultiplyPositive() {
		assertTrue(Multiplication.multiply(2,2) == 4);
	}
	
	@Test
	public final void testMultiplyNegativePositive() {
		assertTrue(Multiplication.multiply(-1,2) == -2);
	}
	
	@Test
	public final void testMultiplyPositiveNegative() {
		assertTrue(Multiplication.multiply(2,-1) == -2);
	}
	
	@Test
	public final void testMultiplyZeroPositive() {
		assertTrue(Multiplication.multiply(0,2) == 0);
	}
	
	@Test
	public final void testMultiplyZeroNegative() {
		assertTrue(Multiplication.multiply(0,-1) == 0);
	}
	
	@Test
	public final void testMultiplyNegativeZero() {
		assertTrue(Multiplication.multiply(-1,0) == 0);
	}
	
	@Test
	public final void testMultiplyDoubleNegative() {
		assertTrue(Multiplication.multiply(-1, -1) == 1);
	}
	
	@Test
	public final void testMultiplyExists() {
		Class<Multiplication>klass = Multiplication.class;
		Method[] methods = klass.getMethods();
		boolean result = false;
		String methodName = "multiply";
		
        for (int i = 0; i < methods.length; i++) {
        	if( methods[i].getName() == methodName) {
        		if(methods[i].getParameterCount() == 2 ) {
        			Class[] parameters = methods[i].getParameterTypes();
        			for(int j = 0; i < parameters.length; i++) {
        				if(parameters[j].getName() == "double") {
        					result = true;
        				};
        			}
        		}
        	}
		}
        assertTrue(result);
	}
}
