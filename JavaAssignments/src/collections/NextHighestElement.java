
/*
* find the next highest element than a given element x in the input array
*/

package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NextHighestElement {
    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 67, 34, 68};
        //   treemap stores elements in ascending order of keys
        // since it implemets SortedMap interface..
        TreeMap<Integer, Byte> tmap = new TreeMap<Integer, Byte>();
        
        for(int i:arr)
            tmap.put(i, null);
            
        System.out.println("Enter an element");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        Integer element = tmap.higherKey(x); 
        if( element != null){
            System.out.print("next highest element than "+x+" is:");
            System.out.println(element);
        } else
            System.out.println("ther is no element greater than "+x+" exists");
            
    }//main() method
}