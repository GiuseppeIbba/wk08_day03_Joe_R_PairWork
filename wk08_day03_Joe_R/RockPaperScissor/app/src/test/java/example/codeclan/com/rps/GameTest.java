package example.codeclan.com.rps;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 24/01/2018.
 */

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void canHaveAnswers() {
        String answer = game.getRandomAnswer();
        assertNotNull(answer);
    }

    @Test
    public void canGetResult(){
        String result = game.getResult("Frog");
        assertNotNull(result);
    }

}
