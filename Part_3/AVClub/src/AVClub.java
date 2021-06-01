import java.util.Scanner;

public class AVClub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String av = scan.nextLine();

		String[] pieces = av.split(" ");

		if (av.equals("")) {
			return;
		}

		int index = 0;

		while (!(av.equals(""))) {
			for (int i = 0; i < pieces.length; i++) {
				if (pieces[i].contains("av")) {
					System.out.println(pieces[i]);
				}
				//index++;
			}
			av = scan.nextLine();
			pieces = av.split(" ");
			//index = 0;
			
			
		}

	}

}
