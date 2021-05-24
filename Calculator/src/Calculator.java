import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first Number: ");
		double x = sc.nextInt();
		
		System.out.println("Input the second number: ");
		double y = sc.nextInt();
		
		//below are the output prints.
		System.out.println("The quotient of a and b is: " + division(x, y) );

		
		sc.close();
		
	}

	public static double division(double a, double b){
		double ans = 0;
		if (b == 0)
			System.out.println("You can not divide by zero.");
		
		else
			ans = a/b;

		return ans;
	}
}