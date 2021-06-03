import java.util.Scanner;
import java.util.ArrayList;

public class PersonalInformationCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ArrayList<PersonalInformation> info = new ArrayList<>();
		
		while (true) {
			System.out.print("First name: ");
			String firstName = scan.nextLine();
			if (firstName.isEmpty()) {
				break;
			}
			
			System.out.print("Last name: ");
			String lastName = scan.nextLine();
			System.out.print("Identification number: ");
			String id = scan.nextLine();
			
			info.add(new PersonalInformation(firstName, lastName, id));
			
		}
		
		for (PersonalInformation in: info) {
			System.out.println(in.getFirstName() + " " + in.getLastName());
		}
		
	}

}
