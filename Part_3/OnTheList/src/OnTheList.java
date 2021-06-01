import java.util.Scanner;
import java.util.ArrayList;

public class OnTheList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> nameList = new ArrayList<>();
		
		while (true) {
			String name = scan.nextLine();
			if (name.equals("")) {
				break;
			}
			
			nameList.add(name);
		}
		
		System.out.print("Search for? ");
		String search = scan.nextLine();
		
		if (nameList.contains(search)) {
			System.out.println(search + " was found!");
		} else {
			System.out.println(search + " was not found!");
		}
	}

}
