package com.pdjb.tptest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

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
	
	@Test
	public final void testAddDoubleNegative() {
		assertTrue(Addition.add(-1, -1) == -2);
	}
	
	@Test (expected = Exception.class)
	public final void testAddIntMaxValue() {
		assertFalse(Addition.add(Integer.MAX_VALUE,Integer.MAX_VALUE) == Integer.MAX_VALUE * 2);
	}
	
	@Test
	public final void testAddExists() {
		Class<Addition>klass = Addition.class;
		Method[] methods = klass.getMethods();
		boolean result = false;
		String methodName = "add";
		
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
