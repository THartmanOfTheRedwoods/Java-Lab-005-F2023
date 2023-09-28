import java.util.Random;
import java.util.random.RandomGenerator;


public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public Dice(int sides) {
        this.sides = sides;
        this.randomGenerator = new Random();
    }

    public int getSides() {
        return this.sides;
    }

    public int roll() {
        this.sideFacingUp = this.randomGenerator.nextInt(this.sides) + 1;
        return sideFacingUp;
    }

    public int view() {
        return this.sideFacingUp;
    }
}




