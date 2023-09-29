import java.util.Random;
public class Dice {
    // Instance variables
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;
    // Constructor
    public Dice(int sides) {
        this.sides = sides;
        this.randomGenerator = new Random();
    }
    // Roll method
    public void roll() {
        this.sideFacingUp = randomGenerator.nextInt(this.sides) + 1;
    }
    // View method
    public int view() {
        return this.sideFacingUp;
    }
}