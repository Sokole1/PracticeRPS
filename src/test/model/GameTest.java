package test.model;

import main.model.Game;
import main.model.Player;
import main.model.RPSEnum;
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

    @Test
    public void testIsTieTrue() {
        Assertions.assertTrue(game.isTie(RPSEnum.ROCK, RPSEnum.ROCK));
        Assertions.assertTrue(game.isTie(RPSEnum.SCISSORS, RPSEnum.SCISSORS));
        Assertions.assertTrue(game.isTie(RPSEnum.PAPER, RPSEnum.PAPER));
    }

    @Test
    public void testIsTieFalse() {
        Assertions.assertFalse(game.isTie(RPSEnum.SCISSORS, RPSEnum.ROCK));
        Assertions.assertFalse(game.isTie(RPSEnum.PAPER, RPSEnum.SCISSORS));
        Assertions.assertFalse(game.isTie(RPSEnum.ROCK, RPSEnum.PAPER));
    }

    @Test
    public void testBeatsOtherWin() {
        Assertions.assertEquals(true, game.beatsOther(RPSEnum.ROCK, RPSEnum.SCISSORS));
        Assertions.assertEquals(true, game.beatsOther(RPSEnum.PAPER, RPSEnum.ROCK));
        Assertions.assertEquals(true, game.beatsOther(RPSEnum.SCISSORS, RPSEnum.PAPER));
    }

    @Test
    public void testBeatsOtherLose() {
        Assertions.assertEquals(false, game.beatsOther(RPSEnum.ROCK, RPSEnum.PAPER));
        Assertions.assertEquals(false, game.beatsOther(RPSEnum.PAPER, RPSEnum.SCISSORS));
        Assertions.assertEquals(false, game.beatsOther(RPSEnum.SCISSORS, RPSEnum.ROCK));
    }
}