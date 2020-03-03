package epamcom.calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operations o = new Operations();
		System.out.println("Enter the 1st number");
		double n = sc.nextInt();
		System.out.println("Enter the 2nd number");
		double m = sc.nextInt();
		System.out.println("Select any operation");
		System.out.println("(1)Addition" + "\n" +"(2)Substraction" + "\n" + "(3)Multiplication" + "\n" + "(4)Division");
		int option = sc.nextInt();
		switch(option){
		case 1:
			System.out.println("RESULT: " + o.addition(n, m));
			break;
		case 2:
			System.out.println("RESULT: " + o.substraction(n, m));
			break;
		case 3:
			System.out.println("RESULT: " + o.multiplication(n, m));
			break;
		case 4:
			System.out.println("RESULT: " + o.division(n, m));
			break;
		default:
			System.out.println("INVALID OPTION");	
		}
	}
}
