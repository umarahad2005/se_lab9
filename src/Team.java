import java.util.ArrayList;
import java.util.List;

class Team {
    private String teamName;
    private String record;
    private List<Player> players; // Aggregation: Team HAS Players
    private Coach coach;          // Association: Team HAS A Coach

    public Team(String teamName, String record) {
        this.teamName = teamName;
        this.record = record;
        this.players = new ArrayList<>();
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public String getTeamName() { return teamName; }
}
