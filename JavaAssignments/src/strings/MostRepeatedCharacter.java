package strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MostRepeatedCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some string");
        String str = sc.next();
        
        int max_count = 0;
        
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(hmap.containsKey(c)){
                hmap.replace(c, hmap.get(c)+1);
                max_count = (max_count > hmap.get(c)) ? max_count : hmap.get(c);
            }
            else
                hmap.put(c, 1);
        } // end of for loop
        
        if(max_count == 0){
            System.out.println("All characters occured only once");
            return;
        }
        
        // we have to search for maximum repeated character
        for(Entry<Character, Integer> entry : hmap.entrySet())
            if(entry.getValue() == max_count){
                System.out.print("The maximum repeated character is:");
                System.out.println(entry.getKey());
                return;
            }
    }
}
