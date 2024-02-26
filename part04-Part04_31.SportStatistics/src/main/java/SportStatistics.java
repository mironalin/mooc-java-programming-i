
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("File: ");
        String fileName = scan.nextLine();

        ArrayList<TeamStatistics> teamStats = readTeamFromFile(fileName);

        System.out.print("Team: ");
        String teamName = scan.nextLine();

        ArrayList<TeamStatistics> gamesOfATeam = new ArrayList<>();
        for (TeamStatistics stats : teamStats) {
            if (teamName.equals(stats.getHomeTeam()) || teamName.equals(stats.getVisitingTeam())) {
                gamesOfATeam.add(stats);
            }
        }

        System.out.println("Games: " + gamesOfATeam.size());

        int wins = 0;

        for (TeamStatistics stats : gamesOfATeam) {
            if (stats.isWinner(teamName) == 1) {
                wins++;
            }
        }

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gamesOfATeam.size() - wins)); 
    }

    public static ArrayList<TeamStatistics> readTeamFromFile(String fileName) {
        ArrayList<TeamStatistics> games = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String fileLine = fileReader.nextLine();

                if (fileLine.isEmpty()) {
                    continue;
                }

                String[] parts = fileLine.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                games.add(new TeamStatistics(homeTeam, visitingTeam, homePoints, visitingPoints));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("File not found");
        }
        return games;
    }

}
