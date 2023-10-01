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
        System.out.println(announceWinner());
    }

    public void takeTurn(Player player) {
        player.toss(die);
    }

    public Player nextPlayer(Player player) {
        if (player == p1) {
            return p2;
        } else {
            return p1;
        }
    }

    public String announceWinner() {
        String result = "";
        result += "Player 1: " + p1.getName() + ", Score: " + p1.getScore() + "\n";
        result += "Player 2: " + p2.getName() + ", Score: " + p2.getScore() + "\n";
        if (p1.getScore() > p2.getScore()) {
            result += "The winner is " + p1.getName() + "!";
        } else if (p1.getScore() < p2.getScore()) {
            result += "The winner is " + p2.getName() + "!";
        } else {
            result += "It's a tie!";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides should the dice have?");
        int sides = scanner.nextInt();
        Game game = new Game(new Player("Alice"), new Player("Bob"), new Dice(sides));
        game.play();
    }
}
