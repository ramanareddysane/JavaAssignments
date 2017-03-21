package arrays;

/*
    This can be efficiently done by implementing MIN-HEAP with
  the array elements and get the third smallest element from the heap.

    In java PriorityQueue already implementing min-heaps,so we will use
  this PriorityQueue class from java.util package...

*/
  /*It will take O(n) time
        O(n + (logn + logn) == O(n) */
import java.util.PriorityQueue;

public class ThirdSmallest {

    public static void main(String args[]) {
        int[] array = {4,2,8,5,6,1,3,7,9};
        PriorityQueue< Integer > pqueue = new PriorityQueue <> ();

        for(int data:array)
            pqueue.add(data);

        // to get third smallest element 
        int i = 1;
        while(i++<=2)
            pqueue.remove();

        System.out.println(pqueue.element());

    }

}