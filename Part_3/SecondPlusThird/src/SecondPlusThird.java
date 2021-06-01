import java.util.Scanner;
import java.util.ArrayList;

public class SecondPlusThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numberList = new ArrayList<>();
		
		System.out.println("Enter numbers: ");
		
		while (true) {
			int num = Integer.valueOf(scan.nextLine());
			if (num == 0) {
				break;
			}
			
			numberList.add(num);
		}
		
		System.out.println(numberList.get(1) + numberList.get(2));
	}

}
