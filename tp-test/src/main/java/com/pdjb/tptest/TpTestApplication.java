package com.pdjb.tptest;
import java.util.Scanner;

public class TpTestApplication {
	
	Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		TpTestApplication calculator = new TpTestApplication();
		Scanner scan = new Scanner(System.in);
		calculator.showMenu();
		int x = scan.nextInt();
	}

	public void showMenu() {
		System.out.println("1.Addition");
		System.out.println("2.Soustraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
	}
}
