import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Password?");
		String password = reader.nextLine();
		
		if (password.equals("Caput Draconis")) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Off with you!");
		}
		
	}

}
