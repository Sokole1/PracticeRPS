package main.model;

import java.util.*;

public class Computer {

    private final String name;
    private int score = 0;

    public Computer(String name) {
        this.name = name;
    }

    // getName() is a public method
    // getScore() is a public method
    // increaseScore() is a public method

    public RPSEnum makeChoice(RPSEnum[] choices) {
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }


    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }
}