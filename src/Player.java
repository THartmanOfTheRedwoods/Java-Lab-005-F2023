import java.util.Random;
public class Player {
    private String name;
    private int score;
    private Dice dice;

    // Constructor
    public Player(String name, int numberOfSides) {
        this.name = name;
        this.score = 0;
        this.dice = new Dice(numberOfSides);
    }

    // Method to get the player's name
    public String getName() {
        return name;
    }

    // Method to get the player's score
    public int getScore() {
        return score;
    }

    // Method to roll the die and record its view in the score
    public void toss() {
        // Roll the dice
        dice.roll();


    }
}
