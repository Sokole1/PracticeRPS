package main.model;

import java.util.Random;

public class Computer extends Player {

    private Random random;
    private RPSEnum[] choices;


    public Computer(String name, RPSEnum[] choices) {
        super(name);
        this.random = new Random();
        this.choices = choices;
    }

    public RPSEnum makeChoice() {
        return choices[random.nextInt(choices.length)];
    }
}