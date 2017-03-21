
package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseURL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an url string..");
        String url = sc.next();

        Matcher matcher;
        
        System.out.print("protocal is: ");
        Pattern protocal_pattern;
        protocal_pattern = Pattern.compile("https?");
        matcher = protocal_pattern.matcher(url);
        if(matcher.find())
            System.out.println(url.substring(matcher.start(), matcher.end()));
        
        
        System.out.print("host name is: ");
        Pattern hostname_pattern;
        hostname_pattern = Pattern.compile("://(.*?)(:|/)"); // ? will restrict
//       the regex match to the first character(: or /) match.
//          This will get the right hostname in url with or without port number
        matcher = hostname_pattern.matcher(url);
        if(matcher.find())
            System.out.println(url.substring(matcher.start()+3, matcher.end()-1));  
        else
            System.out.println("No hostname provided in url");
            
        
        int start_index = 0;
        String path = "\n"; //if nothing is present, then terminal will print new line
        System.out.print("pathString is: ");
        Pattern path_pattern = Pattern.compile("://(.*?)/");;
        matcher = path_pattern.matcher(url);
        if(matcher.find()){
            start_index = matcher.end();
            if(url.indexOf('?')==-1) // print to last of the url
                path = url.substring(start_index);
            else
                path = url.substring(start_index, url.indexOf('?'));
            System.out.println(path);
        }
    }
}