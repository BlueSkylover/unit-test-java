package tw.core;

import org.junit.Before;
import org.junit.Test;
import tw.core.exception.OutOfRangeAnswerException;
import tw.core.model.Record;

import static org.junit.Assert.assertEquals;

/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {
    Answer answer;
    Answer answer2;

    @Before
    public void createAnswer_test(){
        String input="1 2 3 4";
        answer=Answer.createAnswer(input);
        assertEquals(answer.toString(),"1 2 3 4");

    }

    @Test
    public void validate_test() throws OutOfRangeAnswerException {
        answer.validate();
    }

    @Test
    public void check_test(){
        Record record=answer.check(answer);
        assertEquals("4A0B",record.getValue());

    }


}