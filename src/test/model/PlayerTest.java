package test.model;

import main.model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    Player player;
    @BeforeEach
    public void runBefore() {
        player = new Player("Player");
    }

    @Test
    public void testIncreaseScore() {
        player.increaseScore();
        Assertions.assertEquals(1, player.getScore());
        player.increaseScore();
        Assertions.assertEquals(2, player.getScore());
    }

    @Test
    public void testGetName() {
        Assertions.assertEquals("Player", player.getName());
    }

    @Test
    public void testGetScore() {
        Assertions.assertEquals(0, player.getScore());
    }
}
