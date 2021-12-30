package main.model;

public class Game {

    private int maxScore = 5;

    private Player player;
    private Computer computer;

    public Game(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

    public Player getPlayer() {
        return player;
    }

    public Computer getComputer() {
        return computer;
    }

    public int getMaxScore() {
        return maxScore;
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

    // MODIFIES: this
    // EFFECTS: computer makes a move, increment score of winner, return winner or null if no one won yet
    public Player play(RPSEnum move) {
        return new Player("donelsfd");
    }
}