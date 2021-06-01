import java.util.Scanner;
import java.util.ArrayList;

public class RemeberTheseNumbers {

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
		
		for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}
	}

}
