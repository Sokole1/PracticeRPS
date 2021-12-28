package test.model;

import main.model.Computer;
import main.model.Player;
import main.model.RPSEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ComputerTest {
    Computer computer;
    @BeforeEach
    public void runBefore() {
        computer = new Computer("Computer");
    }
    @Test
    public void testGetName() {
        Assertions.assertEquals("Computer", computer.getName());
    }

    @Test
    public void testGetScore() {
        Assertions.assertEquals(0, computer.getScore());
    }
    @Test
    public void testMakeChoice() {
        computer.makeChoice(new RPSEnum[]{RPSEnum.ROCK});
        Assertions.assertEquals(RPSEnum.ROCK, computer.makeChoice(new RPSEnum[]{RPSEnum.ROCK}));

    }
}