import java.util.Scanner;
import java.util.ArrayList;

public class SumOfAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		int sum = 0;
		
		while (true) {
			int num = Integer.valueOf(scan.nextLine());
			if (num == -1) {
				break;
			}
			
			numList.add(num);
		}
		
		for (int num: numList) {
			sum += num;
		}
		
		System.out.println("Sum: " + sum);
	}

}
