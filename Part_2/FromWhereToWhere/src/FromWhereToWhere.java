import java.util.Scanner;

public class FromWhereToWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Where to? ");
		int end = Integer.valueOf(scan.nextLine());
		System.out.println("Where from? ");
		int start = Integer.valueOf(scan.nextLine());
		
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}

}
