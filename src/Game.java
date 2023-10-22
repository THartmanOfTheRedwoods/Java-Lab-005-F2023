import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    Public Game(Player p1, Player p2, Dice die) {
        this.p1;
        this.p2;
        this.die = die;
    }
    public void play() {
        Play current = p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);

        System.out.printIn(announceWinner());

    }

    public Player nextPlayer(Player current)
         if(current == this.p1)

    {
        return this.p2;
    } else

    {
        return this.p1;

    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner()
    System.out.printf("%s rolled %d%n%s rolled %d%n, this.p1.getName(), this.p1.getScore(), this.p2.getScore()");

    {
        if (this.p1.getScore() > this.p2.getScore())
            return String.format("%s Won!", p1.getName());
    }else if (this.p2.getScore() > this.p1.getScore())
        return String.format("%s Won!", p2.getName());
    else
        return String.format("%s and %s Tied!", p1.getName(), p2.getName())
    }

    public static void main(String[] args) {
    }Scanner s = new Scanner(System.in);
System.out.printIn("Enter Player 1's Name: ");
String playerName = s.nextLine();
Player p1 = new Player(playertime);
System.out.printIn("What sided die are we playing with?: ");
int Sides = Integer.parseInt(s.nextline());
Game g = new Game(p1, p2, new Dice(sides));
g.play();
}
