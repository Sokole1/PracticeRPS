package test.model;

import main.model.Computer;
import main.model.RPSEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ComputerTest {

    private Computer computer;

    @BeforeEach
    public void runBefore() {
        computer = new Computer("Computer", new RPSEnum[]{RPSEnum.ROCK});
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
        Assertions.assertEquals(RPSEnum.ROCK, computer.makeChoice());
    }
}