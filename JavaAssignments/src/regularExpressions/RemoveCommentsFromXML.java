
package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveCommentsFromXML {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an XML string.(Without new line at middle)");
        String xml_string = sc.nextLine();
        
        String patternString = "<!--.*-->";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(xml_string);
        
        StringBuilder sb = new StringBuilder(xml_string);
        while(matcher.find())
            sb.delete(matcher.start(), matcher.end());
        
        //xml string without comments
        System.out.println(sb);
        
    }
}
