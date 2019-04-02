package main.java.com.pdjb.tptest;

import java.util.Scanner;
import org.junit.Test;

import static org.junit.Assert.*;

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
	
	public double multiply(double a, double b) {
		double val = a * b;

		return val;
	}
}
