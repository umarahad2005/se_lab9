
class Player extends Person {
    private int number;
    private String position;

    public Player(String name, String address, int number, String position) {
        super(name, address); // Call parent constructor
        this.number = number;
        this.position = position;
    }

    public void play() {
        System.out.println(getName() + " is playing as " + position);
    }
}
