import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    public Game(Player p1, Player p2, Dice die){
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }

    public void play() {
        Player current = this.p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);
        System.out.println("Winner is " + announceWinner());
    }

    public Player nextPlayer(Player current) {
        if(current.getName().equals(this.p1.getName())){
            return this.p2;
        } else {
            return this.p1;
        }
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
        System.out.printf("Player %s, %d%n", this.p1.getName(), this.p1.getScore());
        System.out.printf("Player %s, %d%n", this.p2.getName(), this.p2.getScore());
        if(this.p1.getScore() > this.p2.getScore()){
            return this.p1.getName();
        } else if(this.p1.getScore() < this.p2.getScore()) {
            return this.p2.getName();
        } else{
            return "nobody.";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of sides on the die: ");
        int sides = Integer.parseInt(scan.nextLine());
        Dice die = new Dice(sides);

        //System.out.print("Please enter the number of sides on die 2: ");
        //Dice d2 = new Dice(Integer.parseInt(scan.nextLine()));

        System.out.print("Please enter the name of player 1: ");
        Player p1 = new Player(scan.nextLine());

        System.out.print("Please enter the name of player 2: ");
        Player p2 = new Player(scan.nextLine());

        Game game = new Game(p1,p2,die);
        game.play();
    }
}
