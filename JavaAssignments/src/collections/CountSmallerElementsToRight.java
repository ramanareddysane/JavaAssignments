package collections;

import java.util.Arrays;

public class CountSmallerElementsToRight {
    public static void main(String[] args) {
        int[] arr =  {12, 1, 2, 3, 0, 11, 4};
        int[] count_arr = new int[arr.length];
        
        System.out.println("normal array:"+Arrays.toString(arr));
        
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i])
                    count++;
            }
            count_arr[i] = count;
        }// outer for loop
        
        System.out.println("counted array:"+Arrays.toString(count_arr));
    }
}