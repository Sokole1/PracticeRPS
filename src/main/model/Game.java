package main.model;

public class Game {

    private int maxScore = 1;

    public boolean hasWon(Player player) {
        return player.getScore() >= maxScore;
    }

}
