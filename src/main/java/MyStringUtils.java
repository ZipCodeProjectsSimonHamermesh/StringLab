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
        String[] returnStringArrray = new String[]{};

        return returnStringArrray;
    }

    public static String reverseCapitalizeString(String x){

        return "";
    }

    public static String reverseStringWords(String x){

        return "";
    }

    public static String removeWhitespaceNewLines(String x){

        return "";
    }

    public static String[] returnAllSubstrings(String x){
        String[] returnStringArrray = new String[]{};

        return returnStringArrray;
    }

}
