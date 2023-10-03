import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    public void play() {
        Player current = p1;
        takeTurn(p1);
        Player currrent = nextPlayer(p1);
        takeTurn(current);
        System.out.println(announceWinner());
    }

    public Player nextPlayer(Player current) {
        if(current == this.p1) {
            return this.p2;
        } else {
            return this.p1;
        }
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
        String winner = "";
        System.out.printf("%s rolled %d%n%s rolled %d%n", p1.getName(), p1.getScore(), p2.getName(), p2.getScore());
        if(this.p1.getScore() > this.p2.getScore()) {
            winner = p1.getName();
        } else if (this.p2.getScore() > this.p1.getScore()) {
            winner = p2.getName();
        }
        return String.format("%s won", winner);
    }

    public static void main(String[] args) {
    }

    public Game(Player p1, Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }
}
