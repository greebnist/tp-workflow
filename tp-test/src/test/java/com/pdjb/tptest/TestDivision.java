package com.pdjb.tptest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;

import org.junit.Test;

import com.pdjb.tptest.Division;

public class TestDivision {

	@Test
	public final void testDividePositive() {
		assertTrue(Division.divide(2,2) == 1);
	}
	
	@Test
	public final void testDivideNegativePositive() {
		assertTrue(Division.divide(-1,2) == -0.5);
	}
	
	@Test
	public final void testDividePositiveNegative() {
		assertTrue(Division.divide(2,-1) == -2);
	}
	
	@Test
	public final void testDivideZeroPositive() {
		assertTrue(Division.divide(0,2) == 0);
	}
	
	@Test
	public final void testDivideZeroNegative() {
		assertTrue(Division.divide(0,-1) == 0);
	}
	
	@Test (expected=java.lang.ArithmeticException.class)
	public final void testDivideNegativeZero() {
		Division.divide(-1,0);
	}
	
	@Test (expected=java.lang.ArithmeticException.class)
	public final void testDividePositiveZero() {
		Division.divide(1,0);
	}
	
	@Test
	public final void testDivideDoubleNegative() {
		assertTrue(Division.divide(-1, -1) == 1);
	}
	
	@Test
	public final void testDivideExists() {
		Class<Division>klass = Division.class;
		Method[] methods = klass.getMethods();
		boolean result = false;
		String methodName = "divide";
		
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
