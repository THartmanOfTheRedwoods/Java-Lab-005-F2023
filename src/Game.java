import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    public void play() {
        Player current = p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);
        System.out.print(announceWinner());

    }

    public Player nextPlayer(Player current) {

    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
    }
    public Game(Player p1,Player p2,Dice die){
        this.p1= p1;
        this.p2 = p2;
        this.die = die;

    }

    public static void main(String[] args) {
        Dice d1 = new Dice(6);
        Player p1 = new Player("Finn");
        Game g = new Game(p1, p2, die);
    }
}
