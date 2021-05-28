import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		double sum = 0;
		int count = 0;
		double average = 0.0;
		int even = 0;
		int odd = 0;

		// prompt for input
		System.out.println("Give numbers: ");
		
		while (true) {
			int num = Integer.valueOf(scan.nextLine());
			
			if (num == -1) {
				break;
			}

			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}

			count++;
			sum += num;
		}
		average = sum / count;

		System.out.println("Thx! Bye!");
		System.out.println("Sum: " + sum);
		System.out.println("Numbers: " + count);
		System.out.println("Average: " + average);
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);

	}

}
