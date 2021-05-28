import java.util.Scanner;

public class SumOfASequenceSequel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("First number? ");
		int first = Integer.valueOf(scan.nextLine());
		System.out.println("Last number? ");
		int last = Integer.valueOf(scan.nextLine());
		
		int sum = 0;
		
		for (int i = first; i <= last; i++) {
			sum += i;
		}
		
		System.out.println("The sum is: " + sum);
	}

}
