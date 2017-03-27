
package collections;

import java.util.HashMap;
import java.util.Scanner;

public class PairInArrayWithSumAsX {
    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 67, 34, 68};
        HashMap<Integer, Boolean> hmap = new HashMap<Integer, Boolean>(arr.length);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum value..");
        int sum = sc.nextInt();
        
        for(int i : arr){
            if(hmap.containsKey(sum-i)){
                System.out.println("pair is "+i+" and "+(sum-i));
                return;
            }
            else
                hmap.put(i, true);
        }
        System.out.println("No such pair with sum as "
                + sum+ " is present int this array");
    }
}
