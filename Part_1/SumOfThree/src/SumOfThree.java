import java.util.Scanner;

public class SumOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give the first number:");
		int num1 = Integer.valueOf(scan.nextLine());
		System.out.println("Give the second number:");
		int num2 = Integer.valueOf(scan.nextLine());
		System.out.println("Give the third number:");
		int num3 = Integer.valueOf(scan.nextLine());
		
		System.out.println("The sum of the numbers is " + (num1 + num2 + num3));
	}

}
