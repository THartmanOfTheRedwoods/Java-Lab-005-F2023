public class Player {

    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void toss(Dice die) {
        die.roll();
        int view = die.view();
        score += view;
    }
}

