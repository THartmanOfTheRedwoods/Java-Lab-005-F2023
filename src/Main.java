import java.util.Random;
import java.util.Scanner;

class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public Dice(int sides) {
        this.sides = sides;
        this.randomGenerator = new Random();
    }

    public void roll() {
        this.sideFacingUp = randomGenerator.nextInt(sides) + 1;
    }

    public int view() {
        return this.sideFacingUp;
    }
}

class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void toss(Dice die) {
        die.roll();
        int rolledValue = die.view();
        this.score += rolledValue;
        System.out.println(this.name + " rolled a " + rolledValue + "!");
    }
}

class Game {
    private Player p1;
    private Player p2;
    private Dice die;
    public void takeTurn(Player player) {
        player.toss(this.die);
    }


    public Game(Player p1, Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }

    public void play() {
        Player current = this.p1;

        while (true) {
            takeTurn(current);
            current = nextPlayer(current);
            takeTurn(current);

            if (current.getScore() >= 100) {
                break;
            }
        }

        String winner = announceWinner();
        System.out.println("Winner: " + winner);
    }

    public Player nextPlayer(Player current) {
        if (current == this.p1) {
            return this.p2;
        } else {
            return this.p1;
        }
    }

    public String announceWinner() {
        System.out.println("Player " + p1.getName() + "'s score: " + p1.getScore());
        System.out.println("Player " + p2.getName() + "'s score: " + p2.getScore());

        if (p1.getScore() > p2.getScore()) {
            return p1.getName();
        } else if (p2.getScore() > p1.getScore()) {
            return p2.getName();
        } else {
            return "It's a tie!";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides for the dice: ");
        int sides = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Dice die = new Dice(sides);

        Game game = new Game(player1, player2, die);
        game.play();

        scanner.close();
    }
}
