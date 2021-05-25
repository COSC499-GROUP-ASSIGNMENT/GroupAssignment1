
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first Number: ");

		double x = sc.nextDouble;
		
		System.out.println("Input the second number: ");
		double y = sc.nextDouble();
		
		//below are the output prints.
    		System.out.println("The addition of the two numbers are: " + addition(x,y));
    		System.out.println("The product of x and y is: "+ subtraction(x, y));
		System.out.println("The quotient of a and b is: " + division(x, y) );
		System.out.println("The product of a and b is: " + multiply(x, y));
		System.out.println("Result of: " + x + " % " + y + " is " + (int) modulo(x,y));

		sc.close();
		
	}

	//method to calculate addition
	public static double addition(Double a, Double b) {
		return a + b;
  	}

	//method to calculate division
	public static double division(double a, double b){
		double ans = 0;
		if (b == 0)
			System.out.println("You can not divide by zero.");
		
		else
			ans = a/b;

		return ans;
  	}
    
	//method to calculate multiplication
	public static double multiply(double a, double b) {
		return a * b;

	}
    
	//method to calculate subtraction
  	public static double subtraction(double x, double y) {
        	return x - y;
 	}

	//method to calculate modulo
	public static double modulo(double n1, double n2) {
		return (int)n1 % (int)n2;
	}


}