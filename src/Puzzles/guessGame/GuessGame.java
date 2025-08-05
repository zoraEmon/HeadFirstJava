package Puzzles.guessGame;

public class GuessGame {

    public static void startGame() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int randomNumber = (int) (Math.random() * 10);
        System.out.println("Guess the number between 0 and 9");

        while (true) {
            System.out.printf("Number to guess: %d \n", randomNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            System.out.println("Puzzles.guessGame.Player 1 guessed " + p1.getGuessedNumber());
            System.out.println("Puzzles.guessGame.Player 2 guessed " + p2.getGuessedNumber());
            System.out.println("Puzzles.guessGame.Player 3 guessed " + p3.getGuessedNumber());

            boolean isP1Right = p1.getGuessedNumber() == randomNumber;
            boolean isP2Right = p2.getGuessedNumber() == randomNumber;
            boolean isP3Right = p3.getGuessedNumber() == randomNumber;

            if (isP1Right || isP2Right || isP3Right) {
                System.out.println("We have a winner!");
                System.out.println("P1 guessed the right answer? " + isP1Right);
                System.out.println("P2 guessed the right answer? " + isP2Right);
                System.out.println("P3 guessed the right answer? " + isP3Right);
                System.out.println("Game over!");
                break;
            }
        }
    }
}
