package main.model;

public class Game {

    private int maxScore = 1;
    private Player player;
    private Computer computer;

    public Game(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

    public boolean beatsOther(RPSEnum p, RPSEnum c) {
        if (p == RPSEnum.ROCK && c == RPSEnum.SCISSORS) {
            return true;
        } else if (p == RPSEnum.PAPER && c == RPSEnum.ROCK) {
            return true;
        } else if (p == RPSEnum.SCISSORS && c == RPSEnum.PAPER) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasWon(Player player) {
        return player.getScore() >= maxScore;
    }

    // private -> public
    public boolean isTie(RPSEnum p1, RPSEnum p2) {
        return p1 == p2;
    }
}