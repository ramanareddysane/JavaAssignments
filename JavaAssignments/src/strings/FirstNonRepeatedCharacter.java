package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);		
	System.out.print("Enter a String:");
        String string = sc.next();
        
        // We did't use Hashmap because, insertion order must be maintained....
        LinkedHashMap<Character, Boolean> hmap = new LinkedHashMap <Character, Boolean>();
        for(int i=0; i<string.length();i++)
            if(hmap.containsKey(string.charAt(i)))
                hmap.put(string.charAt(i), false);
            else
                hmap.put(string.charAt(i), true);
        
        for(Map.Entry<Character, Boolean> entry: hmap.entrySet())
          if(entry.getValue()){
              System.out.print("First non repeating character is:");
              System.out.println(entry.getKey());
              return;
          }
        
        System.out.println("All characters are repeated somewhere..");
        
    }
}
