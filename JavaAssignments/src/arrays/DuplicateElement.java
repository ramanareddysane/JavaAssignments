package arrays;

import java.util.*;

class DuplicateElement {
	
	static boolean duplicateElements(int[] array){
		boolean duplicates = false;
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for(int data:array)
			if(!hmap.containsKey(data))
				hmap.put(data,1);
			else 
				hmap.replace(data, hmap.get(data)+1); /* We can also use put(key,value), which 
			replaces the old value, but using replace is meaningful..*/

		System.out.println("Duplicate Values are: ");
		for( Map.Entry<Integer, Integer> entry : hmap.entrySet() )
			if(entry.getValue() > 1){
				System.out.print(" "+entry.getKey());
				duplicates = true;
			}
		System.out.println();
		return duplicates;
	}

	public static void main(String[] args){
		 int[] numbers = { 1, 5, 23,5,23, 2, 1, 6, 3, 1, 8, 12, 3 };
		 if(!duplicateElements(numbers))
		 	System.out.println("Oops...! No duplicates at all. Try to fed me with another array.");
	}
}
