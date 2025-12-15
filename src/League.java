import java.util.ArrayList;
import java.util.List;

class League {
    private List<Team> teams; // Aggregation: League HAS Teams

    public League() {
        this.teams = new ArrayList<>();
    }

    public void addTeam(Team t) {
        teams.add(t);
    }
}