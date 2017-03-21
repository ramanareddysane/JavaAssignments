
package regularExpressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IsIPv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String ipaddress = sc.next();
        
        String valid_num = "([0-1]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
        String ip_pattern = "("+valid_num+".){3}"+valid_num;
                
        if(Pattern.matches(ip_pattern, ipaddress))
            System.out.println("Yes..this is an ip address");
        else
            System.out.println("Nope. It's not an IP address");
    }
}
