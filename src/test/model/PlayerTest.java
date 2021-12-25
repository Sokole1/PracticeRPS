package test.model;

import main.model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @BeforeEach
    public void runBefore() {
        Player player = new Player("Player");
    }

    @Test
    public void testIncreaseScore() {
        Assertions.assertEquals(1, Player.increaseScore(0));
    }

    @Test
    public void testGetName() {
        Assertions.assertEquals("Player", Player.getName());
    }

    @Test
    public void testGetScore() {
        Assertions.assertEquals(0, Player.getScore());
    }
}
