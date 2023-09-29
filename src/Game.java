import java.util.Scanner;
public class Game {
    // instance variables
    Player p1;
    Player p2;
    Dice die;
    // constructor
    public Game(Player p1, Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }
    // play method
    public void play() {
        Player current = this.p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);
        announceWinner();
    }
    // next player method
    public Player nextPlayer(Player current) {
        if(current.equals(this.p1)) {
            return this.p2;
        }
        return this.p1;
    }
    // take turn method
    public void takeTurn(Player player) {
        player.toss(this.die);
    }
    // announce winner method
    public void announceWinner() {
        System.out.printf("Name: %s Score: %d%n", this.p1.getName(), this.p1.getScore());
        System.out.printf("Name: %s Score: %d%n", this.p2.getName(), this.p2.getScore());
        if (p1.getScore() > p2.getScore()) {
            System.out.println(this.p1.getName() + " is the winner!");
        }
        else if (p1.getScore() < p2.getScore()) {
            System.out.println(this.p2.getName() + " is the winner!");
        }
        else if (p1.getScore() == p2.getScore()) {
            System.out.println("It's a draw!");
        }
    }
    // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sides on the die? ");
        int sides = scan.nextInt();
        Player play1 = new Player("Taylor");
        Player play2 = new Player("Ann");
        Dice d = new Dice(sides);
        Game game = new Game(play1, play2, d);
        game.play();
    }
}
