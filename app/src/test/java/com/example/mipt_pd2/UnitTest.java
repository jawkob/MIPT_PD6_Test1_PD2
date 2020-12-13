package com.example.mipt_pd2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {
    @Test
    public void Given_AllKeyboardChars_To_charCounter_To_Test_Output_Value(){
        final String givenString = "`1234567890-=~!@#$%^&*()_+\\][poiuytrewq|}{POIUYTREWQ';lkjhgfdsa\":LKJHGFDSA/.,mnbvcxz?><MNBVCXZ";

        final int expectedResult = 94;
        final int actualResult = StringProcessing.charCounter(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_Null_To_charCounter_To_Test_Output_Value(){
        final String givenString = null;

        final int expectedResult = 0;
        final int actualResult = StringProcessing.charCounter(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_Spaces_To_charCounter_To_Test_Output_Value(){
        final String givenString = "      ";

        final int expectedResult = 0;
        final int actualResult = StringProcessing.charCounter(givenString);

        assertEquals(expectedResult, actualResult);
    }
}