import java.util.Scanner;

public class VariousVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give a number:");
		int num = Integer.valueOf(scanner.nextLine());
		System.out.println("You gave the number " + num);
		
		System.out.println("Give another number: ");
		double num2 = Double.valueOf(scanner.nextLine());
		System.out.println("You gave the number " + num2);

	}

}
