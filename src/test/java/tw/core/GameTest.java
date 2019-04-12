package tw.core;

import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;
import tw.GuessNumberModule;

import static com.google.inject.Guice.createInjector;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * 在GameTest文件中完成Game中对应的单元测试
 */


public class GameTest {
    Injector injector = createInjector(new GuessNumberModule());
    Game game=injector.getInstance(Game.class);

    @Before
    public void guess_test(){
        assertNotNull(game.guess(Answer.createAnswer("1 2 3 4")));
    }

    @Test
    public  void guessHistory_test(){
        assertEquals(1,game.guessHistory().size());
    }

    @Test
    public void  checkCoutinue_test(){
        assertEquals(true,game.checkCoutinue());
    }

    @Test
    public  void  checkStatus_test(){
        assertEquals(GameStatus.CONTINUE, game.checkStatus());
    }

}
