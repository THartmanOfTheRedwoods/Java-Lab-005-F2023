import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    // Constructor
    public Game(Player p1, Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }

    public void play() {
        Player current = this.p1;
        takeTurn(current);
        nextPlayer(current);
        takeTurn(current);
        announceWinner();
    }

    public Player nextPlayer(Player current) {
        // Switch to the other player
        if (current == this.p1) {
            return this.p2;
        } else {
            return this.p1;
        }
    }

    public void takeTurn(Player player) {
        player.toss();
    }

    public String announceWinner() {
        // Display each player's name and score
        System.out.println(p1.getName() + "'s score: " + p1.getScore());
        System.out.println(p2.getName() + "'s score: " + p2.getScore());

        // Determine the winner
        if (p1.getScore() > p2.getScore()) {
            System.out.println("Winner: " + p1.getName());
            return p1.getName();
        } else if (p2.getScore() > p1.getScore()) {
            System.out.println("Winner: " + p2.getName());
            return p2.getName();
        } else {
            System.out.println("It's a tie!");
            return "Tie";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request and store the number of sides for the die
        System.out.print("Enter the number of sides for the die: ");
        int numberOfSides = scanner.nextInt();

        // Create two players and a die
        Player player1 = new Player("Player 1", numberOfSides);
        Player player2 = new Player("Player 2", numberOfSides);
        Dice die = new Dice(numberOfSides);

        // Create a new Game object and play the game
        Game game = new Game(player1, player2, die);
        game.play();
    }
}
