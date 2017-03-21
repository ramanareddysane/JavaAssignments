
/*
* It checks whether given string contains /../ or /./
*/

package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IfConains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.next();
        
        String pattern = ".*(/.{1,2}/).*";
        if(Pattern.matches(pattern, string))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
