package collections;

import java.util.HashSet;
import java.util.Scanner;

public class NoOfDuplicates {
    public static void main(String[] args) {
        System.out.println("Enter some strings..");
        Scanner sc = new Scanner(System.in);
        HashSet<String> hset = new HashSet<String>();
        
        int dupCount = 0;
        for(String str:sc.nextLine().split(" "))
            if(!hset.add(str))
                dupCount++;
        
        System.out.println("No of duplicates are:"+dupCount);
            
    }
}
