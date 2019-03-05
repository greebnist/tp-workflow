package com.pdjb.tptest;

import java.util.Scanner;

public class Substraction {
	
	public static double substraction() {
		double a, b;
		Scanner scan = new Scanner(System.in); 
		System.out.println("Entrez un nombre");
		a = scan.nextDouble(); 
		System.out.println("Entrez un 2eme nombre");
		b = scan.nextDouble(); 
		double res = substract(a, b); 
		
		return res; 
	}
	
	public static double substract(double a, double b) {
		double res = a - b; 
		
		return res; 
	}
}
