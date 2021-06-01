import java.util.Scanner;

public class LastWorrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			String input = scan.nextLine();
			if (input.equals("")) {break;}
			
			String[] pieces = input.split(" ");
			System.out.println(pieces[pieces.length - 1]);
			
		}
	}

}
