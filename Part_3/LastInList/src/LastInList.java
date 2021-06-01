import java.util.Scanner;
import java.util.ArrayList;

public class LastInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<>();
		
		System.out.println("Enter names: ");
		
		while (true) {
			String name = scan.nextLine();
			if (name.equals("")) {
				break;
			}
			
			nameList.add(name);
		}
		
		System.out.println(nameList.get(nameList.size() - 1));
	}

}
