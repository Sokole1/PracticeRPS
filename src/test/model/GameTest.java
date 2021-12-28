package test.model;

import main.model.Game;
import main.model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GameTest {
    Game game;
    Player player1;
    Player player2;
    @BeforeEach
    public void runBefore() {
        game = new Game();
    }

    @Test
    public void testHasWon() {
        player1 = new Player("player1");
        player1.increaseScore();
        Assertions.assertTrue(game.hasWon(player1));

        player2 = new Player("player2");
        Assertions.assertFalse(game.hasWon(player2));

    }

}
