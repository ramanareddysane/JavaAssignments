package collections;

import java.util.HashMap;

public class MajorityElementInArray {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 4, 4, 2, 4, 4 };
        int maj_elem = majorityElement(arr);
        if(maj_elem != -1)
            System.out.println("Majority Element is:"+maj_elem);
        else
            System.out.println("No majority element found");
    }
    
    static int majorityElement(int[] arr){
        int count = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i:arr)
            if(hmap.containsKey(i)){
                hmap.replace(i, hmap.get(i)+1);
                count = (count>hmap.get(i))?count:hmap.get(i);
                if(count>(arr.length/2))
                    return i;
            }else
                hmap.put(i, 1);
        return -1;
    }
}
