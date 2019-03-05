package com.pdjb.tptest;

import java.util.Scanner;
import org.junit.Test;

import static org.junit.Assert.*;

public class Multiplication {
	Scanner scan = new Scanner(System.in); 
	
	public double mutliplication() {
		double a, b;
		System.out.println("Entrez une première valeur");
		a = scan.nextDouble();
		System.out.println("Entrez une deuxième valeur");
		b = scan.nextDouble();
		double val = mutliplier(a, b);

		return val;
	}
	
	public double mutliplier(double a, double b) {
		double val = a * b;

		return val;
	}
	
	@Test
	 public void testMultiplier() {
		 Multiplication multiplication = new Multiplication();
         assertTrue(multiplication.mutliplier(2,2) == 4);
   }
}
