
package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class SumOfKSmallestElements {
    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 67, 34, 68};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k value..");
        int k =sc.nextInt();
        
        TreeSet<Integer> tset = new TreeSet<Integer>();
        for(int i : arr)
            tset.add(i);
        
        int sum = 0;
        //treeset stores elements in Ascending order..
        for(Integer i:tset){
            if(k-- == 0)
                break;
            sum += i;
        }
        System.out.println("sum of k smallest elements is: "+sum);  
    }
}
