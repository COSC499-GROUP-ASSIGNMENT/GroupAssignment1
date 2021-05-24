import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first Number: ");
		double x = sc.nextInt();
		
		System.out.println("Input the second number: ");
		double y = sc.nextInt();
		
        System.out.println("The product of x and y is: "+ subtraction(x, y));

        sc.close();

	}

    public static double subtraction(double x, double y) {
        return x-y;
    }

}