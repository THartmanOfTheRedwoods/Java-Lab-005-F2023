/**
 *
 * @author Trevor Hartman
 * @author Angelina Perez
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    public Game(Player p1, Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }

    public void play() {
        Player current = p1;
        takeTurn(current);
        current = nextPlayer(p1);
        takeTurn(current);

        System.out.println(announceWinner());
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public Player nextPlayer(Player current) {
        if(current == this.p1) {
            return this.p2;
        } else {
            return this.p1;
        }
    }

    public String announceWinner() {
        System.out.printf("%s rolled %d%n%s rolled %d%n", p1.getName(), p1.getScore(), p2.getName(), p2.getScore());

        if(this.p1.getScore() > this.p2.getScore()) {
            return String.format("%s won", p1.getName());
        } else if(this.p2.getScore() > this.p1.getScore()) {
            return String.format("%s won", p2.getName());
        } else {
            return String.format("%s and %s tied", p1.getName(), p2.getName());
        }
    }
}

