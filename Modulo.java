package cosc499_calc;

import java.util.Scanner;

public class Modulo {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the first integer");
		int n1 = scn.nextInt();
		System.out.println("Please enter the second number (modulus)");
		int n2 = scn.nextInt();
		System.out.println("Result of: " + n1 + " % " + n2 + " is " + n1%n2);
	}
}