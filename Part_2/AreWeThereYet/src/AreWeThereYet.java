import java.util.Scanner;

public class AreWeThereYet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.println("Give a number: ");
			int number = Integer.valueOf(reader.nextLine());
			if (number == 4) {
				break;
			}
		}
	}

}
