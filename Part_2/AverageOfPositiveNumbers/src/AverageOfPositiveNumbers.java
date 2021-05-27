import java.util.Scanner;

public class AverageOfPositiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		double sum = 0.0;
		double average = 0.0;
		
		while (true) {
			int num = Integer.valueOf(scan.nextLine());
			
			if (num == 0) {
				break;
			}
			if (num > 0) {
				count++;
				sum += num;
			}
			
		}
		
		average = sum / count;
		if (count == 0) {
			System.out.println("Cannot calculate the average");
		} else {
			System.out.println(average);
		}
		
		
		
		
	}

}
