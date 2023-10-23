/**
 * @author Trevor Hartman
 * @author MJ Fracess
 *
 * @since Version 1.0
 */

public class Player {
    private String name;
    private int score;

    //Constructor
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    public String getName(){
        return name;
    }
    public int getScore() {
        return score;
    }
    public void toss(Dice die) {
        die.roll();
        this.score = die.view();
    }
}

