import java.util.Scanner;
import java.util.ArrayList;

public class ListSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<>();

		System.out.println("Enter names: ");

		while (true) {
			String names = scan.nextLine();
			if (names.equals("")) {
				break;
			}
			
			nameList.add(names);
		}
		
		System.out.println("In total: " + nameList.size());

	}

}
