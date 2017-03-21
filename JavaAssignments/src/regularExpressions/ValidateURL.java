package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateURL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an url string..");
        String url = sc.next();
        
        String patternString = "https?://[www.]?";
        
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(url);
        
        if(matcher.lookingAt())
            System.out.println("It is an valid url");
        else
            System.out.println("Nope..! invalid url");
        
    }
}

/* 
    NOTE:
       The above regular expression is also valid for
        1) http://////www, [or]
        2) http:///
       Because thy also starts with http:// 
*/

/*
    refer http://regexr.com/ to play and learn
    with regular expressions.
*/