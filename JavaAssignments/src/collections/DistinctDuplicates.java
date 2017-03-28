package collections;

import java.util.HashMap;
import java.util.Map;

public class DistinctDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,5,3,2,1,5,6,2};
        HashMap<Integer, Boolean> hmap = new HashMap<>();
        
        for(int i:arr)
            if(hmap.containsKey(i))
                hmap.replace(i, Boolean.TRUE);
            else
                hmap.put(i, Boolean.FALSE);
        
        int distinct_dup_count = 0;
        for(Map.Entry<Integer,Boolean> entry : hmap.entrySet())
            if(entry.getValue())
                distinct_dup_count++;
        
        System.out.println("No of distinct duplicates in array are:"+distinct_dup_count);
    }
}
