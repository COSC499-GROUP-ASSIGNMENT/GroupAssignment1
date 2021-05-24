import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first Number: ");
		int x = sc.nextInt();
		
		System.out.println("Input the second number: ");
		int y = sc.nextInt();
		

	}

    public static int subtraction(int x, int y){
        int answer = x-y;
        return answer;
    }

}