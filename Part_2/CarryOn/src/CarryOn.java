import java.util.Scanner;

public class CarryOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		while(true) {
			System.out.println("Shall we carry on?");
			String input = reader.nextLine();
			
			if (input.equals("no")) {
				break;
			}
		}
	}

}
