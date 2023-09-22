import java.util.Scanner;
// Chris Shortt
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
        System.out.println("Drumroll please..\t  \t...and the\t Winner \tis !! \t" + announceWinner());
    }}

    public Player nextPlayer(@org.jetbrains.annotations.NotNull Player current) {
        if(current.getName().equals(this.p1.getName())){
            return this.p2;
        }
        return this.p1;

            public void takeTurn(Player  player) {
            player.toss(this.die);
        }

        }

    public String announceWinner(){
        System.out.printf("Player:%s, %d%n", this.p1.getName(), this.p1.getScore());
        System.out.printf("Player:%s, %d%n", this.p2.getName(), this.p2.getScore());
        if(p1.getScore()> p2.getScore()) {
            return p1.getName();
        }else if(p2.getScore()> p1.getScore()) {
            return p2.getName();
        }
        return "TIE";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print ("Please enter the number of sides:");
        int sides = Integer.parseInt(s.nextLine());
        Player p1 = new Player("Mr.Waffles");
        Player p2 = new Player("HarviTheHurricane");
        Dice die = new Dice(sides);

        Game game = new Game(p1, p2, die);
        game.play();
    }
}
