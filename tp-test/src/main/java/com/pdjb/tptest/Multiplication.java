package com.pdjb.tptest;

import java.util.Scanner;

public class Multiplication {
	Scanner scan = new Scanner(System.in); 
	
	public double multiplication() {
		double a, b;
		System.out.println("Entrez une première valeur");
		a = scan.nextDouble();
		System.out.println("Entrez une deuxième valeur");
		b = scan.nextDouble();
		double val = multiply(a, b);

		return val;
	}
	
	public static double multiply(double a, double b) {
		double val = a * b;

		return val;
	}
}
