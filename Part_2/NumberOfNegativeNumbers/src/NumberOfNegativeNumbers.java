import java.util.Scanner;

public class NumberOfNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int count = 0; //hold the counts
		
		while (true) {
			System.out.println("Give a number: ");
			int num = Integer.valueOf(scan.nextLine());
			
			//task is to exit if input is 0
			if (num == 0) {
				break;
			}
			//task is to add 1 if input value is less than zero
			if (num < 0) {
				count++;
			}
			
			
		}
		
		//task is to print out the count 
		System.out.println("Number of negative numbers: " + count);
	}

}
