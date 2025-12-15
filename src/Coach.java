class Coach extends Person {
    private String accreditationLevel;
    private int yearsExperience;

    public Coach(String name, String address, String accreditationLevel, int yearsExperience) {
        super(name, address);
        this.accreditationLevel = accreditationLevel;
        this.yearsExperience = yearsExperience;
    }

    public void coachTeam() {
        System.out.println(getName() + " is coaching the team.");
    }
}