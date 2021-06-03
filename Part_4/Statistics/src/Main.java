import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Statistics statistics = new Statistics();
		Statistics even = new Statistics();
		Statistics odd = new Statistics();
		
		System.out.println("Enter the numbers: ");
		
		while (true) {
			int num = Integer.valueOf(scan.nextLine());
			if (num == -1) {
				break;
			}
			
			if (num % 2 == 0) {
				even.addNumber(num);
			}
			if (num % 2 != 0) {
				odd.addNumber(num);
			}
			
			statistics.addNumber(num);
		}
		
		System.out.println("Sum: " + statistics.sum());
		System.out.println("Sum of even numbers: " + even.sum());
		System.out.println("Sum of odd numbers: " + odd.sum());
//		statistics.addNumber(3);
//		statistics.addNumber(5);
//		statistics.addNumber(1);
//		statistics.addNumber(2);
//		
//		System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
	}

}
