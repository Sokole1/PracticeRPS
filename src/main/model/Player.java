package main.model;

public class Player {

    private final String name;
    private int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public int increaseScore() {
        return this.score++;
    }
}
