
package collections;

import java.util.HashMap;
import java.util.Scanner;

public class MaximunOccuringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some string");
        System.out.println(getMaxChar(sc.next()));
    }
    
    static char getMaxChar(String str){
       char ch = ' ';
       int maxCount = 1;
       HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
       for(int i=0; i<str.length();i++){
           char tmp = str.charAt(i);
           if(hmap.containsKey(tmp)){
              hmap.replace(tmp, hmap.get(tmp)+1);
              if(hmap.get(tmp)>maxCount){
                maxCount = hmap.get(tmp);
                ch = tmp;
              }   
           }else
               hmap.put(tmp, 1);
       } // for loop
       
       if(maxCount == 1){
           System.out.println("All characters occured only once..");
           return ' ';
       }
       return ch;
    }
}
