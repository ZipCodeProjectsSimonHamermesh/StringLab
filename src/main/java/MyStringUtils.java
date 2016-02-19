import com.sun.xml.internal.fastinfoset.util.CharArray;

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
        System.out.println(resultString);
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
        String[] returnStringArrray = new String[]{};

        return returnStringArrray;
    }

}
