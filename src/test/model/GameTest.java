package test.model;

import main.model.Computer;
import main.model.Game;
import main.model.Player;
import main.model.RPSEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {

    private Game game;
    private Player player1, player2;

    @BeforeEach
    public void runBefore() {
        player1 = new Player("player1");
        game = new Game(player1, new Computer("computer", new RPSEnum[]{RPSEnum.ROCK}));
        player1.setScore(game.getMaxScore() - 1);
    }

    @Test
    public void testHasWon() {
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
        Assertions.assertTrue(game.beatsOther(RPSEnum.ROCK, RPSEnum.SCISSORS));
        Assertions.assertTrue(game.beatsOther(RPSEnum.PAPER, RPSEnum.ROCK));
        Assertions.assertTrue(game.beatsOther(RPSEnum.SCISSORS, RPSEnum.PAPER));
    }

    @Test
    public void testBeatsOtherLose() {
        Assertions.assertFalse(game.beatsOther(RPSEnum.ROCK, RPSEnum.PAPER));
        Assertions.assertFalse(game.beatsOther(RPSEnum.PAPER, RPSEnum.SCISSORS));
        Assertions.assertFalse(game.beatsOther(RPSEnum.SCISSORS, RPSEnum.ROCK));
    }

    @Test
    public void testPlayTie() {

    }
}