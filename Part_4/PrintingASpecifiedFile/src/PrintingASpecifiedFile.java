import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingASpecifiedFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("While file should have its contents printed? ");
		String input = scanner.nextLine();
		
		try (Scanner fileScanner = new Scanner(Paths.get(input))) {
			while (fileScanner.hasNextLine()) {
				String row = scanner.nextLine();
				
				System.out.println(row);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
