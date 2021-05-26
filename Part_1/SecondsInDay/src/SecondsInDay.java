import java.util.Scanner;

public class SecondsInDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many days would you like to convert to seconds?");
		int day = Integer.valueOf(scan.nextLine());
		int seconds = day * 24 * 60 * 60;
		System.out.println(seconds);
		
	}

}
