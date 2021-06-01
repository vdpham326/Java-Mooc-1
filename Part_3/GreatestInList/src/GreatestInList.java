import java.util.Scanner;
import java.util.ArrayList;

public class GreatestInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		while (true) {
			int num = Integer.valueOf(scan.nextLine());
			if (num == -1) {
				break;
			}
			
			numList.add(num);
		}
		
		int greatest = numList.get(0);
		for (int i = 1; i < numList.size(); i++) {
			if (greatest < numList.get(i)) {
				greatest = numList.get(i);
			}
		}
		
		System.out.println("The greatest number: " + greatest);
	}

}
