import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Give a year: ");
		int year = Integer.valueOf(reader.nextLine());
		
		if (((year % 4 == 0) && (year % 100 == 1)) || (year % 400 == 0)) {
			System.out.println("The year is a leap year."); 
		} else {
			System.out.println("The year is not a leap year.");
		}
	}

}
