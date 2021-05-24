import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first Number: ");
		int x = sc.nextInt();
		
		System.out.println("Input the second number: ");
		int y = sc.nextInt();
		
		//below are the output prints.
		System.out.println("The product of a and b is: " + multiply(x, y));

		
		sc.close();
		
	}

	public static double multiply(double a, double b) {
	    return a * b;
	}
}