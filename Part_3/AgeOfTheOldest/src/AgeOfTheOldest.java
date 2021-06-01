import java.util.Scanner;

public class AgeOfTheOldest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int age = 0;
		int oldest = 0;
		
		while (true) {
			String input = scan.nextLine();
			if (input.equals("")) {
				break;
			}
			
			String[] parts = input.split(",");
			age = Integer.valueOf(parts[1]);
			
			if (oldest < age) {
				oldest = age;
			}
		}
		
		System.out.println("Age of the oldest: " + oldest);
	}

}
