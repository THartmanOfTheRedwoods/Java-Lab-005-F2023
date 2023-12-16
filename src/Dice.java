import java.util.Random;
public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    // Constructor
    public Dice(int sides) {
        this.sides = sides;
        this.randomGenerator = new Random();
        roll(); // Roll the dice upon instantiation to set an initial sideFacingUp value
    }

    // Method to roll the dice
    public void roll() {
        // Generate a random number between 1 and sides (inclusive)
        sideFacingUp = randomGenerator.nextInt(sides) + 1;
    }

    // Method to view the current side facing up
    public int view() {
        return sideFacingUp;
    }
}

