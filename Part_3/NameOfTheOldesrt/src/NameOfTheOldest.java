import java.util.Scanner;

public class NameOfTheOldest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		int oldest = 0;
		
		while (true) {
			String input = scan.nextLine();
			if (input.equals("")) {
				break;
			}
			
			String[] parts = input.split(",");
			int age = Integer.valueOf(parts[1]);
			
			if (oldest < age) {
				oldest = age;
				name = parts[0];
			}
		}
		
		System.out.println("Name of the oldest: " + name);
	}

}
