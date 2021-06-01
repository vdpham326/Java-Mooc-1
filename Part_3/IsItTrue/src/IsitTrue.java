import java.util.Scanner;

public class IsitTrue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give a string: ");
		String word = scan.nextLine();
		
		if (word.equals("true")) {
			System.out.println("You got it right!");
		} else {
			System.out.println("Try again!");
		}
	}
}
