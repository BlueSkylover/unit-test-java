package tw.core.generator;


import com.google.inject.Injector;
import org.junit.Test;
import org.mockito.internal.matchers.NotNull;
import tw.GuessNumberModule;
import tw.core.Answer;
import tw.core.exception.OutOfRangeAnswerException;

import static com.google.inject.Guice.createInjector;
import static org.junit.Assert.assertNotNull;

/**
 * 在AnswerGeneratorTest文件中完成AnswerGenerator中对应的单元测试
 */
public class AnswerGeneratorTest {
    Injector injector=createInjector(new GuessNumberModule());
    AnswerGenerator answerGenerator=injector.getInstance(AnswerGenerator.class);

    @Test
    public void generate_test() throws OutOfRangeAnswerException {
        Answer answer = answerGenerator.generate();
        assertNotNull(answer);
    }


}

