import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		
		while (true) {
			System.out.println("Give a number: ");
			int num = Integer.valueOf(scan.nextLine());
			
			if (num == 0) {
				break;
			}
			count++;
			sum += num;
		}
		
		double average = sum / (count * 1.0);
		System.out.println("Average of the numbers: " + average);
	}

}
