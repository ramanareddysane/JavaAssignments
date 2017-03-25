package collections;

import java.util.ArrayList;
import java.util.Collections;

public class NoOfOnes {
    public static void main(String[] args) {
        int[] arr ={0, 0, 0, 1, 1, 1, 1, 1, 1};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i:arr)
            list.add(i);
        System.out.println(list);
        
        int i = Collections.binarySearch(list, 1);   
        
        while( --i>=0 && list.get(i) == 1);
        
        
        System.out.println("No of 1's :" + (list.size()-i-1));
    }
}
