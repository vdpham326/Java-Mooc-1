import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		while (true) {
			int num = Integer.valueOf(scan.nextLine());
			if (num == 9999) {
				break;
			}
			
			numList.add(num);
		}
		
		int smallest = numList.get(0);
		
		for (int i = 1; i < numList.size(); i++) {
			if (smallest > numList.get(i)) {
				smallest = numList.get(i);
			}
		}
		
		System.out.println("Smallest number: " + smallest);
		
		for (int i = 0; i < numList.size(); i++) {
			if (smallest == numList.get(i) ) {
				System.out.println("Found at index: " + i);
			}
		}
	}

}
