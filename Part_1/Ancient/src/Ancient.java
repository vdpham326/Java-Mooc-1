import java.util.Scanner;

public class Ancient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give a year: ");
		int year = Integer.valueOf(scan.nextLine());
		
		if (year < 2015) {
			System.out.println("Ancient history!");
		}
		
	}

}
