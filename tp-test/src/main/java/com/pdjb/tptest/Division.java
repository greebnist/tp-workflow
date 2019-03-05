package com.pdjb.tptest;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

public class Division {
	Scanner scan = new Scanner(System.in); 
	
	public double division() {
		double a, b;
		System.out.println("Entrez une première valeur");
		a = scan.nextDouble();
		System.out.println("Entrez une deuxième valeur");
		b = scan.nextDouble();
		double val = diviser(a, b);

		return val;
	}
	
	public double diviser(double a, double b) {
		double val = a / b;

		return val;
	}
	
	@Test
	 public void testDiviser() {
		 Division division = new Division();
        assertTrue(division.diviser(6,2) == 3);
  }
}
