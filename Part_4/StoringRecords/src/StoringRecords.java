import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Filename: ");
		String file = scan.nextLine();
		
	}
	
	public static ArrayList<Person> readRecordsFromFile(String file) {
		ArrayList<Person> persons = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		try (Scanner reader = new Scanner(Paths.get(file))) {
			String line = scan.nextLine();
			
			String[] parts = line.split(",");
			String name = parts[0];
			int age = Integer.valueOf(parts[1]);
			
			persons.add(new Person(name, age));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return persons;
	}

}
