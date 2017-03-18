package arrays;

/*

	Assuming the array is SORTED, we are  applying
	BINARY SEARCH on the array for an element, which
	takes O(logn) time. 
		But the linear search takes O(n) time, if 
	array is UNSORTED.We can sort them in O(nlogn) time,
	and apply the binary search on it.But the overall time
	taken will be 
		O(nlogn + logn) = O(nlogn); which is far worse than
	linear search, which takes O(n) time..


*/
import java.util.Scanner;

class FindElement {
	
	static int[] array = {2,6,8,11,14,19,33,50};

	static int isPresent(int left, int right,int element) {
		int mid = 0;
		while(left<=right){
			mid = left + (right-left)/2;
			if(element == array[mid])
				return mid;
			if(element < array[mid])
				right = mid - 1;
			else if( element > array[mid])
				left = mid + 1;
		}
		return -1;
		
	}

	public static void main(String[] args){
		int lastIndex = array.length - 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an element to search");
		int x = sc.nextInt();

		/*	Checking if the search element is in the range of the 
		   the array elements or not */
		  if( (x<array[0]) || (x>array[lastIndex]) ) {
		  	System.out.println("Element is not at all in the range of this array");
		  	return;
		  }

		 // apply binary search on the element
		int index = isPresent(0, lastIndex, x);
		if(index == -1)
			System.out.println("Element is not present in the array");
		else
			System.out.println("Element is present at index "+index);

	}
}