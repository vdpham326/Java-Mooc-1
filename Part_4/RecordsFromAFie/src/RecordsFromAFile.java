import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Name of the file: ");
		String file = scan.nextLine();
		
		try (Scanner read = new Scanner(Paths.get(file))) {
			while (read.hasNextLine()) {
				String line = scan.nextLine();
				
				//split the line into an array, separated by a comma
				String[] parts = line.split(",");
				String name = parts[0];
				int age = Integer.valueOf(parts[1]);
				
				System.out.println(name + ", age: " + age + " years");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
