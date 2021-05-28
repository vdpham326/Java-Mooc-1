import java.util.Scanner;

public class SumOfASequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Last number? ");
		int num = Integer.valueOf(scan.nextLine());
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println("The sum is " + sum);
	}

}
