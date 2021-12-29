package main.model;

import java.util.Random;

public class Computer extends Player {

    private Random random = new Random();

    public Computer(String name) {
        super(name);
    }

    public RPSEnum makeChoice(RPSEnum[] choices) {
        return choices[random.nextInt(choices.length)];
    }
}