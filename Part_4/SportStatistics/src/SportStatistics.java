import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class SportStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("File: ");
		String file = scan.nextLine();

		System.out.println("Team: ");
		String team = scan.nextLine();

		int gamesPlayed = 0;
		int wins = 0;
		int losses = 0;

		try (Scanner reader = new Scanner(Paths.get(file))) {
			while (reader.hasNextLine()) {
				String line = scan.nextLine(); // read each line in the file

				// split the data in each line into an array
				String[] parts = line.split(",");
				String homeTeam = parts[0];
				String awayTeam = parts[1];
				int homeScore = Integer.valueOf(parts[2]);
				int awayScore = Integer.valueOf(parts[3]);
				
				if (homeTeam.equals(team)) {
					gamesPlayed++;
					if (homeScore > awayScore) {
						wins++;
					} else {
						losses++;
					}
				}
				
				
			}

		} catch (Exception e) {
			System.out.println(e.getMessage()); // print error message
		}
		
		System.out.println("Games: " + gamesPlayed);
		System.out.println("Wins: " + wins);
		System.out.println("Losses: " + losses);
		
	}

}
