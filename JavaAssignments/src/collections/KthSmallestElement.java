
package collections;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 67, 34, 68};
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i:arr)
           pq.add(i);
        
        System.out.println("Enter k to find kth smallest element");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        if(k>arr.length){
            System.out.println("index is greaterthan the array length");
            return;
        }
            
        int i = 1;
        while(i++ < k)
            pq.remove();
        
        System.out.println(pq.element());
    }

}
