
package regularExpressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IsHTML {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of file name");
        String string = sc.next();
        
        String pattern = "(?i).+.html?"; // (?i) makes case-insensitive comparision..
        if(Pattern.matches(pattern, string))
            System.out.println("Yes It is a html file name");
        else
            System.out.println("No.. Its not an html file name.");
    }
}
