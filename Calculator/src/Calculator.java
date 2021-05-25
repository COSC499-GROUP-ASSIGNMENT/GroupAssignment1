import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first Number: ");
		double x = sc.nextDouble;
		
		System.out.println("Input the second number: ");
		double y = sc.nextDouble();
		
		System.out.println("The addition of the two numbers are: " + addition(x,y));
		
		
		sc.close();
		
	}

	public static double addition(Double a, Double b) {
		
		return a+b;
	}
}