import java.util.Scanner;

public class LineByLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("")) {
            return;
        }
        
        String[] fragments = input.split(" ");
        int index = 0;
        while (!(input.equals("")) && index < fragments.length) {
            for (int i = 0; i < fragments.length; i++) {
                System.out.println(fragments[i]);
                index++;
            }
            input = scanner.nextLine();
            fragments = input.split(" ");
            index = 0;
        }
		
		
	}

}
