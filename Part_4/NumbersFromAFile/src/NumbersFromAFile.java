import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class NumbersFromAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		int count = 0;
		
		System.out.println("File? ");
		String file = scan.nextLine();
		System.out.println("Lower bound? ");
		int lower = Integer.valueOf(scan.nextLine());
		System.out.println("Upper bound? ");
		int upper = Integer.valueOf(scan.nextLine());
		
		
		//read the number in the file
		try (Scanner reader = new Scanner(file)) {
			while (reader.hasNextLine()) {
				int number = Integer.valueOf(reader.nextLine());
				if (number >= lower && number <= upper) {
					count++;
				}
				
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.print("Numbers: " + count);
	}

}
