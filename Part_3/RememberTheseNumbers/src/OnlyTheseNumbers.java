import java.util.Scanner;
import java.util.ArrayList;

public class OnlyTheseNumbers {

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
		
		System.out.println("From where? ");
		int start = Integer.valueOf(scan.nextLine());
		
		System.out.println("To where? ");
		int end = Integer.valueOf(scan.nextLine());
		
		for (int i = start; i <= end; i++) {
			System.out.println(numList.get(i));
		}
	}

}
