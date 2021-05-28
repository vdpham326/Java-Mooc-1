import java.util.Scanner;

public class Reprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many times?");
		int num = Integer.valueOf(scan.nextLine());
		int count = 0;
		
		while (count < num) {
			printText();
			count++;
		}
	}
	
	public static void printText() {
		System.out.println("In a hole in the ground there lived a method");
	}

}
