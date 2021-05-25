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
		System.out.println("The quotient of a and b is: " + division(x, y) );
		System.out.println("The product of a and b is: " + multiply(x, y));


		
		sc.close();
		
	}

	public static double addition(Double a, Double b) {
		
		return a+b;

	public static double division(double a, double b){
		double ans = 0;
		if (b == 0)
			System.out.println("You can not divide by zero.");
		
		else
			ans = a/b;

		return ans;
  }
    
	public static double multiply(double a, double b) {
	    return a * b;

	}
}