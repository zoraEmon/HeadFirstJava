import Puzzles.guessGame.Player;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        Player[] players = new Player[7];

        players[0] = p1;
        players[1] = p2;
        players[2] = p2;
        players[3] = p3;

        players[1].guessNumber();

        System.out.println(p2.getGuessedNumber());
        System.out.println(players[2].getGuessedNumber());
        System.out.println(players[3].getGuessedNumber());
    }
}
