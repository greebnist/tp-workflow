package main.java.com.pdjb.tptest;
import java.util.Scanner;

public class TpTestApplication {
	
	Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		TpTestApplication calculator = new TpTestApplication();
		Addition addition = new Addition();
		Multiplication multiplication = new Multiplication();
		Division division = new Division();
		Substraction substraction = new Substraction();
		Scanner scan = new Scanner(System.in);
		calculator.showMenu();
		int x = scan.nextInt();
		double score;
		
		switch (x) {
		case 1:
			score = addition.addition();
			System.out.println(score);
			break;
		case 2:
			score = substraction.substraction();
			System.out.println(score);
			break;
		case 3:
			score = multiplication.multiplication();
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
