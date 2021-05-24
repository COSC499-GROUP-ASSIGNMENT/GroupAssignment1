package cosc499_calc;

import java.util.Scanner;

public class Modulo {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the first number");
		double n1 = scn.nextDouble();
		System.out.println("Please enter the second number (modulus)");
		double n2 = scn.nextDouble();
		System.out.println("Result of: " + n1 + " % " + n2 + " is " + (int) modulo(n1,n2));
		scn.close();
	}
	
	public static double modulo(double n1, double n2) {
		return (int)n1 % (int)n2;
	}
}