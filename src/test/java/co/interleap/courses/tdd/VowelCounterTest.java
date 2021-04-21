package co.interleap.courses.tdd;

import org.junit.Test;
import static org.junit.Assert.*;
public class VowelCounterTest {

    @Test
    public void checkVowelsInEmptyString(){
        VowelCounter obj=new VowelCounter();
        assertEquals(0,obj.countVowel(""));
    }

    @Test
    public void checkSingleVowelsAndNoConsonant()
    {
        assertEquals(1,new VowelCounter().countVowel("a"));
    }

    @Test
    public void checkMultipleVowelsAndNoConsonants()
    {
        assertEquals(3,new VowelCounter().countVowel("aei"));
    }

    @Test
    public void checkMultipleVowelsAndConsonants()
    {
        assertEquals(4,new VowelCounter().countVowel("aasdee"));
    }
}