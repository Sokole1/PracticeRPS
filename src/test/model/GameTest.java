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
    public void testPlayWinNotOver() {
        int initalPlayerScore = game.getPlayer().getScore();
        int initalComputerScore = game.getPlayer().getScore();
        Player winner = game.play(RPSEnum.PAPER);
        Assertions.assertEquals(initalPlayerScore++, game.getPlayer().getScore());
        Assertions.assertEquals(initalComputerScore, game.getComputer().getScore());
        Assertions.assertNull(winner);
    }
    @Test
    public void testPlayWinOver() {
        int initalPlayerScore = game.getPlayer().getScore();
        int initalComputerScore = game.getPlayer().getScore();
        Player winner = game.play(RPSEnum.PAPER);
        Assertions.assertEquals(initalPlayerScore++, game.getPlayer().getScore());
        Assertions.assertEquals(initalComputerScore, game.getComputer().getScore());
        Assertions.assertEquals(game.getPlayer(), winner);
    }

    @Test
    public void testNoOneWonPlayerWinsRound() {
        player1.setScore(game.getMaxScore() - 2);

        int initialPlayerScore = game.getPlayer().getScore();
        int initialComputerScore = game.getComputer().getScore();

        Assertions.assertNull(game.play(RPSEnum.PAPER));
        Assertions.assertEquals(initialPlayerScore + 1, player1.getScore());
        Assertions.assertEquals(initialComputerScore, game.getComputer().getScore());
    }

    @Test
    public void testNoOneWonComputerWinsRound() {
        player1.setScore(game.getMaxScore() - 2);

        int initialPlayerScore = game.getPlayer().getScore();
        int initialComputerScore = game.getComputer().getScore();


        Assertions.assertNull(game.play(RPSEnum.SCISSORS));
        Assertions.assertEquals(initialPlayerScore, player1.getScore());
        Assertions.assertEquals(initialComputerScore + 1, game.getComputer().getScore());
    }
}