package Puzzles.guessGame;

public class Player {
    private int guessedNumber;

    public Player() {
        guessedNumber = 0;
    }

    public int getGuessedNumber() {
        return guessedNumber;
    }

    public void guessNumber() {
        guessedNumber = (int) (Math.random() * 10);
    }

    public void guess() {
        guessNumber();
        System.out.printf("I am guessing %d. \n", guessedNumber);
    }
}
