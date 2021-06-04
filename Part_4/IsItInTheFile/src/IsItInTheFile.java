import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class IsItInTheFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		//prompt user for name of the file
		System.out.println("Name of the file: ");
		String fileName = scan.nextLine();
		
		System.out.println("Search for: ");
		String search = scan.nextLine();
		//read in the file with the correct file name
		try (Scanner readFile = new Scanner(Paths.get(fileName))) {
			while (readFile.hasNextLine()) {
				list.add(readFile.nextLine());
			}
			
			if (list.contains(search)) {
				System.out.println("Found!");
			} else {
				System.out.println("Not found.");
			}
		} catch (Exception e) {
			System.out.println("Reading the file " + fileName + " failed.");
		}
		
		
		
		
	}

}
