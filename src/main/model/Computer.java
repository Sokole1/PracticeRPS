package main.model;

import java.util.Arrays;
import java.util.Random;

public class Computer extends Player {

    private Random random;
    private RPSEnum[] choices;


    public Computer(String name, RPSEnum[] choices) {
        super(name);
        this.random = new Random();
        this.choices = choices;
    }
    // EFFECTS: Make a random choice out of the options
    public RPSEnum makeChoice() {
        return choices[random.nextInt(choices.length)];
    }

    @Override
    public String toString() {
        return "Computer{" +
                super.toString() +
                ", choices=" + Arrays.toString(choices) +
                '}';
    }
}