import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter username: ");
		String name = scan.nextLine();
		System.out.print("Enter password: ");
		String password = scan.nextLine();
		
		if ((name.equals("alex") && password.equals("sunshine")) ||  
				(name.equals("emma") && password.equals("haskell"))) {
			System.out.println("You have successfully logged in!");
		} else {
			System.out.println("Incorrect username or password!");
		}
	}

}
