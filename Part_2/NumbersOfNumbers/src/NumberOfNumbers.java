import java.util.Scanner;

public class NumberOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//task to keep track of the number of inputed values
		int input = 0;
		
		//task is to read input from user
		while (true) {
			System.out.println("Give a number: ");
			
			//task is to read user inputted number
			int num = Integer.valueOf(scan.nextLine());
			
			//task is to exit the loop if the user has inputted zero
			if (num == 0) {
				break;
			}
			
			//task is to add 1 for each input value
			input += 1;
			
		}
		
		//task is to display the total input values
		System.out.println("Numbers of numbers: " + input);
	}

}
