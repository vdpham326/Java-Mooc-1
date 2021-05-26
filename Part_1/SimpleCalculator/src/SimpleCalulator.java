import java.util.Scanner;

public class SimpleCalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give the first number: ");
		int num1 = Integer.valueOf(scanner.nextLine());
		System.out.println("Give the second number: ");
		int num2 = Integer.valueOf(scanner.nextLine());
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / (double)num2));
	}

}
