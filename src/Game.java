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

    public void takeTurn(Player player) {
        player.toss(this.die);
    }
    public Player nextPlayer(Player current) {
        if(current == this.p1){
            return this.p2;
        }else {
            return this.p1;
        }
    }

    public String announceWinner() {
        System.out.printf("%s rolled %d%n%s rolled %d", p1.getName(), p1.getScore(), p2.getName(), p2.getScore());
        if(this.p1.getScore() > this.p2.getScore()){
            return String.format("%n%s won!", p1.getName());}
        else if(this.p2.getScore() > this.p1.getScore()){
            return String.format("%n%s won!", p2.getName());}
        else {
            return String.format("%n%s and %s tied!", p1.getName(), p2.getName());
        }
    }
    public Game(Player p1,Player p2,Dice die){
        this.p1= p1;
        this.p2 = p2;
        this.die = die;

    }
}
