package com.pdjb.tptest;

import java.util.Scanner;

public class Multiplication {
	Scanner scan = new Scanner(System.in); 
	
	public double mutliplication() {
		double a, b;
		System.out.println("Entrez une première valeur");
		a = scan.nextDouble();
		System.out.println("Entrez une deuxième valeur");
		b = scan.nextDouble();
		double val = a * b;

		return val;
	}
}
