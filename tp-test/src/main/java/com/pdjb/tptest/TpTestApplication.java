package com.pdjb.tptest;
import java.util.Scanner;

public class TpTestApplication {
	
	Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		TpTestApplication calculator = new TpTestApplication();
		Multiplication multiplication = new Multiplication();
		Division division = new Division();
		Scanner scan = new Scanner(System.in);
		calculator.showMenu();
		int x = scan.nextInt();
		double score;
		
		switch (x) {
		case 1:
			
		case 2:
		
		case 3:
			score = multiplication.mutliplication();
			System.out.println(score);
			break;
		case 4:
			score = division.division();
			System.out.println(score);
			break;
		default:
			System.out.println("Mauvais choix");
			break;
}
	}

	public void showMenu() {
		System.out.println("1.Addition");
		System.out.println("2.Soustraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
	}
}
