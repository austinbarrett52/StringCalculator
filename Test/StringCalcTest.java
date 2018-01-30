import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StringCalcTest {

    @Test
    void AddTest() {
        //empty string, no numbers test
        assertEquals(0, StringCalc.Add(""));
        //test of one number
        assertEquals(5, StringCalc.Add("5"));
        //test of two numbers
        assertEquals(14, StringCalc.Add("6,8"));
        assertEquals(-14, StringCalc.Add("-6,-8"));
        assertEquals(2, StringCalc.Add("8,-6"));
        assertEquals(0, StringCalc.Add("0,0"));
        //test of many different lengths
        assertEquals(15, StringCalc.Add("1,2,3,4,5"));
        assertEquals(-15, StringCalc.Add("-1,-2,-3,-4,-5"));
        assertEquals(22, StringCalc.Add("2,1,9,10"));
        assertEquals(7, StringCalc.Add("1000,-1000,7"));

    }

}