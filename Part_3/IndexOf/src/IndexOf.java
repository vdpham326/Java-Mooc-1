import java.util.Scanner;
import java.util.ArrayList;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		System.out.println("Enter numbers: ");
		
		while (true) {
			int num = Integer.valueOf(scan.nextLine());
			if (num == -1) {
				break;
			}
			
			numList.add(num);
		}
		
		System.out.print("Search for? ");
		int search = Integer.valueOf(scan.nextLine());
		
		for (int i = 0; i < numList.size(); i++) {
			if (search == numList.get(i)) {
				System.out.println(search + " is at index " + i);
			}
		}
	}

}
