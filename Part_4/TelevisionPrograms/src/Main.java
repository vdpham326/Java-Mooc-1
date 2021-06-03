import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<TelevisionProgram> programs = new ArrayList<>();
		
		while (true) {
			System.out.print("Name: ");
			String name = scan.nextLine();
			if (name.isEmpty()) {
				break;
			}
			
			System.out.print("Duration: ");
			int duration = Integer.valueOf(scan.nextLine());
			
			programs.add(new TelevisionProgram(name, duration));
		}
		
		System.out.print("Program's maximum duration? ");
		int time = Integer.valueOf(scan.nextLine());
		
		for (TelevisionProgram program: programs) {
			if (program.getDuration() <= time) {
				System.out.println(program);
			}
		}
	}

}
