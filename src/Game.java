
class Game {
    private String score;
    private String location;
    private Team homeTeam;
    private Team awayTeam; // The two arrows pointing to Team

    public Game(String location, Team home, Team away) {
        this.location = location;
        this.homeTeam = home;
        this.awayTeam = away;
        this.score = "0-0"; // Default score
    }
}
