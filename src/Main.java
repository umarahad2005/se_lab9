
public class Main {
    public static void main(String[] args) {
        // Create a Coach
        Coach myCoach = new Coach("John Doe", "123 Street", "Level 1", 10);

        // Create a Team and assign Coach
        Team myTeam = new Team("Tigers", "5-0");
        myTeam.setCoach(myCoach);

        // Create a Player and add to Team
        Player p1 = new Player("Alice", "456 Ave", 10, "Striker");
        myTeam.addPlayer(p1);

        // Test method
        p1.play();
        myCoach.coachTeam();
    }
}