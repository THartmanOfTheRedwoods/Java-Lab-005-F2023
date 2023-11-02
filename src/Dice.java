import java.util.Random;
// Chris Shortt
public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    // Constructor
    public Dice(int sides) {
        this.sides = sides;
        this.randomGenerator = new Random();
    }
    public void roll(){
        this.sideFacingUp = this.randomGenerator.nextInt(sides) + 1;
    }
    public int view(){
        return this.sideFacingUp;
    }

                                                                    }
