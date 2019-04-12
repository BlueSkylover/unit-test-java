package tw.controllers;

import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import tw.GuessNumberModule;
import tw.commands.GuessInputCommand;
import tw.commands.InputCommand;
import tw.core.Answer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static com.google.inject.Guice.createInjector;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * 在GameControllerTest文件中完成GameController中对应的单元测试
 */
public class GameControllerTest {

    Injector injector = createInjector(new GuessNumberModule());
    GameController gameController=injector.getInstance(GameController.class);

    ByteArrayOutputStream byout=new ByteArrayOutputStream();

    @Before
    public  void init(){
        PrintStream printS=new PrintStream(byout);
        System.setOut(printS);
    }

    public String systemOut(){
        return byout.toString();
    }

    @Test
    public void beginGame_test() throws IOException {
        gameController.beginGame();
        assertEquals(systemOut(),"------Guess Number Game, You have 6 chances to guess!  ------\r\n");

    }

    InputCommand mockInputCommand = Mockito.mock(GuessInputCommand.class);

    @Test
    public void play_test() throws IOException {
        when(mockInputCommand.input()).thenReturn(Answer.createAnswer("1 2 3 4"));
        gameController.play(mockInputCommand);

    }
}