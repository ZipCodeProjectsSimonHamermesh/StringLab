/**
 * Created by simonhamermesh on 2/19/16.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class MyStringUtilsTest {

    @Test
    public void testMyStringUtils_combineStringArray(){
       String[] input = new String[]{"a","bc","defg"};
        assertTrue("a,bc,defg".equals(MyStringUtils.combineStringArray(input)));
    }

    @Test
    public void testMyStringUtils_splitStringByNewLine(){
        String[] result = new String[]{"a","bc","defg"};
        assertTrue(Arrays.equals(result, MyStringUtils.splitStringByNewLine("a\nbc\ndefg")));
    }

    @Test
    public void testMyStringUtils_reverseCapitalizeString(){
        assertTrue("rEVERSE sTRING".equals(MyStringUtils.reverseCapitalizeString("Reverse String")));
    }

    @Test
    public void testMyStringUtils_reverseStringWords(){
       assertTrue("tac god hsif".equals(MyStringUtils.reverseStringWords("cat dog fish")));
    }

    @Test
    public void testMyStringUtils_removeWhitespaceNewLines(){
       assertTrue("a\nbc\ndefg".equals(MyStringUtils.removeWhitespaceNewLines("a    bc defg")));
    }

    @Test
    public void testMyStringUtils_returnAllSubstrings(){

        assertTrue(MyStringUtils.returnAllSubstrings("cat").length == 6);
        String[] result = new String[]{"c","a","t","ca","at","cat"};
        assertTrue(Arrays.equals(MyStringUtils.returnAllSubstrings("cat"),result));

        assertTrue(MyStringUtils.returnAllSubstrings("     ").length == 15);
        result = new String[]{"a","b","c","d","e","ab","bc","cd","de","abc","bcd","cde","abcd","bcde","abcde"};
        assertTrue(Arrays.equals(MyStringUtils.returnAllSubstrings("abcde"),result));

    }

    @Test
    public void testMyStringUtils_stringTrimmer(){
        String[] inputString = new String[]{"12345678902234556789032345678904234578905234567890623456789072345678908234567890EIGHTY",
                "THIS SENTENCE WILL HAVE FEWER THAN EIGHTY CHARACTERS"};

        assertTrue(MyStringUtils.stringTrimmer(inputString[0],80).length() <= 80);
        assertTrue(MyStringUtils.stringTrimmer(inputString[1],80).length() <= 80);
    }

    @Test
    public void testMyStringUtils_formattedString(){

        String[] inputString = new String[]{"12345678902234556789032345678904234578905234567890623456789072345678908234567890EIGHTY",
                "THIS SENTENCE WILL HAVE FEWER THAN EIGHTY CHARACTERS"};
        assertTrue(inputString[0].length()>80);
        assertTrue(inputString[1].length()<80);

        String expectedResult = String.format("%80s %-80s", "RANDOMLY GENERATED STRING TRIMMED TO 80 CHARACTERS", "HEXADECIMAL VALUE OF STRING LENGTH") + "\n" +
                String.format("%80s %-80X", MyStringUtils.stringTrimmer(inputString[0],80) , MyStringUtils.stringTrimmer(inputString[0],80).length()) + "\n" +
                String.format("%80s %-80X", inputString[1] , inputString[1].length());

        assertTrue(MyStringUtils.formattedString(inputString).equals(expectedResult));

    }

}
