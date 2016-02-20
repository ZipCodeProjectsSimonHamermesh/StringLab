
import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Random;

/**
 * Created by simonhamermesh on 2/19/16.
 */
public class MyStringUtils {

    public static String combineStringArray(String[] x){
        String returnString = "";
        for(String y : x){
           returnString = returnString.concat(y);
           returnString = returnString.concat(",");
        }
        returnString = returnString.substring(0,returnString.length()-1);
        return returnString;
    }

    public static String[] splitStringByNewLine(String x){

        return x.split("\n");
    }

    public static String reverseCapitalizeString(String x){

        char[] charArray = x.toCharArray();
        char[] resultCharArray = new char[charArray.length];

        for(int i = 0; i<charArray.length;i++){
            char c = charArray[i];
            if(Character.isUpperCase(c)){
                resultCharArray[i] = (Character.toLowerCase(c));
            }
            if(!(Character.isUpperCase(c))){
                resultCharArray[i] = (Character.toUpperCase(c));
            }
        }

        return new String(resultCharArray);
    }

    public static String reverseStringWords(String x){

       String[] stringsToReverse = x.split(" ");
       String resultString = "";

       for(String s : stringsToReverse){
           StringBuilder stringBuilder = new StringBuilder();
           stringBuilder.append(s);
           stringBuilder = stringBuilder.reverse();
           stringBuilder.append(" ");

           resultString = resultString.concat(stringBuilder.toString());
       }
        resultString = resultString.trim();
        return resultString;
    }

    public static String removeWhitespaceNewLines(String x){
        String[] toRemoveWhiteSpaceNewLine = x.split(" ");
        String resultString = "";

        for(String y : toRemoveWhiteSpaceNewLine){
            if(!(y.length() == 0)){
            resultString = resultString.concat(y);
            resultString = resultString.concat("\n");
            }
        }
        resultString = resultString.substring(0, resultString.length()-1);
        return resultString;
    }

    public static String[] returnAllSubstrings(String x){

        int charCount = x.length();
        String[] returnStringArray;
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < charCount; i++) {

            for (int j = 0; j < charCount - i; j++) {
                stringBuilder.append(x.substring(j, j + i + 1)).append(",");
            }

        }

        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        returnStringArray = stringBuilder.toString().split(",");
        return returnStringArray;
    }

    public static String formattedString(String[] x){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(
                String.format("%80s %-80s", "RANDOMLY GENERATED STRING TRIMMED TO 80 CHARACTERS", "HEXADECIMAL VALUE OF STRING LENGTH"))
                .append("\n");

        for(String string : x){
            String shortenedString = MyStringUtils.stringTrimmer(string,80);
            stringBuilder.append(String.format("%80s %-80X", shortenedString ,shortenedString.length()));
            stringBuilder.append("\n");
        }

        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }

    public static String stringTrimmer(String x,int y){
        if(x.length()>y){return x.substring(0,y);}
        return x;
    }

    public static String[] randomStringArrayGenerator(int x){

        String[] randomStringArray = new String[x];
        Random random = new Random();
        for(int i=0; i<x;i++){

            char[] randomCharArray = new char[random.nextInt(200)];
            for(int j = 0; j<randomCharArray.length;j++){
                randomCharArray[j] = (char)(random.nextInt(89)+32);
            }

            randomStringArray[i] = new String(randomCharArray);
        }
        return randomStringArray;
    }

}