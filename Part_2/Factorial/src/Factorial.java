import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Give a number: ");
		int num = Integer.valueOf(scan.nextLine());
		
		int factorial = 1;
		
		for (int i = 1; i <= num; i++) {
			factorial *= i; 
		}
		
		System.out.println("Factorial: " + factorial);
	}
}
