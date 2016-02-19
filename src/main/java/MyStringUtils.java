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
