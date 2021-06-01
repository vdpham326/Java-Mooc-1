import java.util.Scanner;

public class FirstWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		while (!(input.equals(""))) {
			String[] pieces = input.split(" ");
			System.out.println(pieces[0]);
			
			input = scan.nextLine();
			
		}
	}

}
