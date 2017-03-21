package strings;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string sentence..");
        
        String str = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        for(String string:str.split(" "))
            sb.append(string);
        
        System.out.println(sb);
    }
}
