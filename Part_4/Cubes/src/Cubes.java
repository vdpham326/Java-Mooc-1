import java.util.Scanner;

public class Cubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter inputs: ");
		
		while (true) {
			String input = scan.nextLine();
			if (input.equals("end")) {
				break;
			}
			int num = Integer.valueOf(input);
			System.out.println(num * num * num);
		}
	}

}
