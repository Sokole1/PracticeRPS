package main.model;

public class Game {

    private int maxScore = 1;

    public boolean hasWon(Player player) {
        return player.getScore() >= maxScore;
    }

    // private -> public
    public boolean isTie(RPSEnum p1, RPSEnum p2) {
        return p1 == p2;
    }

}
