import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.println("What is your first number? ");
		int num1 = input.nextInt();

		System.out.println("What is your second number? ");
		int num2 = input.nextInt();

        int result = num1 + num2;

		System.out.println("The addition of the two numbers is: " + result);

        input.close();

    }
}
