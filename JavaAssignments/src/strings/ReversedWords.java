
package strings;

import java.util.Scanner;

public class ReversedWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        
        String[] words = sc.nextLine().split(" ");
        
        StringBuilder sb = new StringBuilder();
        for(int i = words.length -1; i>=0 ; i--)
            sb.append(words[i]+" ");
        
        System.out.println(sb.toString());
    }
}
