package tw.core;


import org.junit.Test;
import tw.core.generator.RandomIntGenerator;

import static org.junit.Assert.assertNotNull;

/**
 * 在RandomIntGeneratorTest文件中完成RandomIntGenerator中对应的单元测试
 */
public class RandomIntGeneratorTest {
    RandomIntGenerator randomIntGenerator =new RandomIntGenerator();

    @Test
    public  void  generateNums_test(){
        String result=randomIntGenerator.generateNums(9,4);
        assertNotNull(result);
    }

}