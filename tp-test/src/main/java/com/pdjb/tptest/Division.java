package com.pdjb.tptest;

import java.util.Scanner;

public class Division {
	Scanner scan = new Scanner(System.in); 
	
	public double division() {
		double a, b;
		System.out.println("Entrez une première valeur");
		a = scan.nextDouble();
		System.out.println("Entrez une deuxième valeur");
		b = scan.nextDouble();
		double val = divide(a, b);

		return val;
	}
	
	public static double divide(double a, double b) {
		double val = a / b;

		return val;
	}
}
