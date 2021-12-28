package test.model;


import main.model.Game;
import main.model.RPSEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    Game game;

    @BeforeEach
    public void runBefore() {
        game = new Game();
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