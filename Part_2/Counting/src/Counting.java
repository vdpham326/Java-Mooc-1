import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int number = Integer.valueOf(reader.nextLine());
		
		for (int i = 0; i <= number; i++) {
			System.out.println(i);
		}
	}

}
