public class TeamStatistics {
    private String home;
    private String visiting;
    private int homePoints;
    private int visitingPoints;

    public TeamStatistics(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.home = homeTeam;
        this.visiting = visitingTeam;
        this.homePoints = homeTeamPoints;
        this.visitingPoints = visitingTeamPoints;
    }

    public String getHomeTeam() {
        return this.home;
    }

    public String getVisitingTeam() {
        return this.visiting;
    }

    public int isWinner(String team) {
        if (team.equals(this.home) && this.homePoints > this.visitingPoints) {
            return 1;
        }

        if (team.equals(this.visiting) && this.visitingPoints > this.homePoints) {
            return 1;
        }

        return 0;
    }

}
