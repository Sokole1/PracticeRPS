package main.model;

import java.util.*;

public class Computer extends Player {

    public Computer(String name) {
        super(name);
    }

    public RPSEnum makeChoice(RPSEnum[] choices) {
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }

}