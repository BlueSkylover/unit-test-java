package tw.core;

import org.junit.Test;
import tw.validator.InputValidator;

import static org.junit.Assert.assertEquals;

/**
 * 在InputValidatorTest文件中完成InputValidator中对应的单元测试
 */
public class InputValidatorTest {
    InputValidator inputValidator=new InputValidator();

    @Test
    public void validate_test(){
        assertEquals(true, inputValidator.validate("1 5 9 8"));
        assertEquals(false, inputValidator.validate("1 5 9"));
        assertEquals(false, inputValidator.validate("1 5 9 45"));
        assertEquals(false, inputValidator.validate("1 5 9 -6"));
        assertEquals(false, inputValidator.validate("1 5 9 6 9"));
    }


}
