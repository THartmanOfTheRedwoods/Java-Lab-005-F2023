import java.util.Random;

/**
 *
 * @author Cassandra Portlock
 *
 * @since Version 1.0
 *
 */

public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public Dice(int sides) {
        this.sides = sides;
        this.randomGenerator = new Random();
    }

    public void roll(){
        this.sideFacingUp = this.randomGenerator.nextInt(this.sides);
    }

    public int view(){
        return this.sideFacingUp;
    }
}