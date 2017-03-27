/*
 *   Find four elements a, b, c and d in an array 
 * such that a+b = c+d using HashMap
 */
package collections;

import java.util.HashMap;
import java.util.HashSet;

public class FindTwoPairsSum {
    
    static class Pair{
         int first;
         int second;
         Pair(int fir, int sec){
             first = fir;
             second = sec;
         }
         public boolean equals(Pair present){ // considers (1,2) and (2,1) as same..
             return ((first == present.first)&&(second == present.second))
                  ||((first == present.second)&&(second == present.first));
         }
         public String toString(){
             return "("+first+","+second+")";
         }
    } // class Pair
    
    static class Set{
        Pair pair1,pair2;
        Set(Pair p1, Pair p2){
            pair1 = p1;
            pair2 = p2;
        }
        public String toString(){
            return "{"+ pair1 + pair2 +"}";
        }
    } // for entire set of 2 pairs
    
    public static void main(String[] args) {
        int arr[]= {3,5,4,7,1,2,5};
        if(!findPairs(arr))
            System.out.println("No such pairs exits in this array");
    }
    
    static boolean findPairs(int[] a){
        boolean pair_exists = false;
        HashMap<Integer,Set> hmap = new HashMap<>(); //(sum,pair)
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a.length;j++){
                Pair present = new Pair(a[i],a[j]);
                int sum = a[i]+a[j];
                if(!hmap.containsKey(sum))
                    hmap.put(sum, new Set(present,null));
                else {
                    Set set = hmap.get(sum);
                    if(set.pair2 == null){ // simply update it
                        set.pair2 = new Pair(a[i],a[j]);
                        pair_exists = true;
                    }
                    if(!set.pair2.equals(present) && !set.pair1.equals(present)){ // then it is different pair
                        System.out.print("Sum:"+sum+" ");
                        System.out.println("{"+ set.pair2 + present +"}");
                    }
                } // end of else
            } //end of inner for loop
        //end of outer for loop(no brackets though)
        return pair_exists;
    }   
}

/*
    It will look complicated but, it will handle all the duplicate pairs...
       like (4,1) and (3,2)
            (4,1) and (3,2)
            (4,1) and (2,3)
            (4,1) and (2,3)....... only one of them is printed.

            It won't allow pairs such as (4,1) and (1,4);
*/