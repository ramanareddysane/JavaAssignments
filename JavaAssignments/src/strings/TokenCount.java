package strings;

import java.util.Scanner;

public class TokenCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int token_count;
                
        System.out.println("Enter target String");
        String string = sc.nextLine();
        
        System.out.println("Enter target String");
        String token = sc.next();
        
        token_count = (string.split(token).length) - 1;
        System.out.println(token_count);    
    }
}