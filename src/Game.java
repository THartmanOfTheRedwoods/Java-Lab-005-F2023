//Naqibullah haiwadpal
//10.11.2023
import java.util.Scanner;

public class Game {
    private Player p1;
    private Player p2;
    private Dice die;

    public Game(Player p1, Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }

    public void play() {
        Player current = p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);
        String winner = announceWinner();
        System.out.println("The winner is " + winner);
    }

    private Player nextPlayer(Player current) {
        if (current == p1) {
            return p2;
        } else {
            return p1;
        }
    }

    private void takeTurn(Player player) {
        player.toss(this.die);
    }

    private String announceWinner() {
        int score1 = p1.getScore();
        int score2 = p2.getScore();
        System.out.println("Player 1 (" + p1.getName() + ") has a score of " + score1);
        System.out.println("Player 2 (" + p2.getName() + ") has a score of " + score2);

        if (score1 > score2) {
            return p1.getName();
        } else if (score2 > score1) {
            return p2.getName();
        } else {
            return "It's a tie!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides for the dice: ");
        int sides = scanner.nextInt();

        Dice die = new Dice(sides);
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        Game game = new Game(player1, player2, die);
        game.play();
    }
}

class Dice {
    private int sideFacingUp;
    private int sides;
    private java.util.Random randomGenerator;

    public Dice(int sides) {
        this.sides = sides;
        randomGenerator = new java.util.Random();
    }

    public void roll() {
        sideFacingUp = randomGenerator.nextInt(sides) + 1;
    }

    public int view() {
        return sideFacingUp;
    }
}

class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void toss(Dice die) {
        die.roll();
        score += die.view();
    }
}
