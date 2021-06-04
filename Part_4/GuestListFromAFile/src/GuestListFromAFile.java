import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GuestListFromAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("Name of the file: ");
		String fileName = scan.nextLine();
		
		//implement reading the file here.
		try (Scanner reader = new Scanner(Paths.get(fileName))) {
			while (reader.hasNextLine()) {
				list.add(reader.nextLine());
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		System.out.println("Enter names, an empty line quits. ");
		
		while (true) {
			String name = scan.nextLine();
			if (name.isEmpty()) {
				break;
			}
			
			if (list.contains(name)) {
				System.out.println("The name is on the list.");
			} else {
				System.out.println("The name is not on the list.");
			}
		}
		
		System.out.println("Thank you!");
	}

}
