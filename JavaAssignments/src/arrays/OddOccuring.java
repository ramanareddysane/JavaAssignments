package arrays;

import java.util.*;

class OddOccuring {

	static int[] array = {2,5,2,2,3,6,3,7,5,5,7,7};
	// static int[] array = {2,2,3,3,5,5,7,7};
	
	/*	 this finds and prints numbers that occur odd umber
	 of times */
	static void showOddOccurings(){
		Map<Integer,Integer> hmap = new HashMap<Integer, Integer>();
		boolean occured = false;
		for(int data:array)
			if(!hmap.containsKey(data))
				hmap.put(data,1);
			else
				hmap.put(data, hmap.get(data)+1);

		// find whether any element is present odd number of times....
		System.out.println("Elments that occured odd number of times are:");
		for( Map.Entry<Integer, Integer> entry : hmap.entrySet() ){
			if( (entry.getValue()%2) != 0 ){ // occured odd number of tines
				System.out.println(entry.getKey()+":"+entry.getValue()+" times");
				occured = true;
			} 
		}// end of for loop

		// if every element occurs even number of times..... then.... 
		if(!occured)
			System.out.println("\n Oops..!! It seems there is no such element in this array");
	}

	public static void main(String[] args){
		showOddOccurings();
	}

}