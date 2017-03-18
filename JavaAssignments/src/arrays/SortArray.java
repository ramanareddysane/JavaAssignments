package arrays;

/*
	We are using mergesort to sort the elements in
	an array1
*/

class SortArray {
	
	//Integer.MAX_VALUE gives max integer value ~~ 2147483647
	static final int INFINITY = Integer.MAX_VALUE;

	static int[] array = {5,2,4,9,7,12,3};
	
	// method that initiates merge sort 
	static void mergeSort(int firstIndex, int lastIndex){
		if(firstIndex < lastIndex){
			int midIndex = (firstIndex + lastIndex)/2;
			mergeSort(firstIndex, midIndex);
			mergeSort(midIndex+1, lastIndex);
			merge(firstIndex, midIndex, lastIndex);
		}
	} // end of mergesort method..

	// merge the given two SORTED ARRAYS.
	static void merge(int first, int mid, int last){
		int leftArrayLength = mid - first + 1;
		int rightArrayLength = last - mid;
		
		int[] leftArray = new int[leftArrayLength+1];
		int[] rightArray = new int[rightArrayLength+1];
		
		System.arraycopy(array,first,leftArray,0,leftArrayLength);
		System.arraycopy(array,mid+1,rightArray,0,rightArrayLength);
		leftArray[leftArrayLength] = INFINITY;
		rightArray[rightArrayLength] = INFINITY;

		/*	place the elements in original array in sorted manner
		   by comparing elements in two sorted arrays....*/
		int i = 0, j = 0, k = first;
		for(; k<=last;k++){
			if(leftArray[i] <= rightArray[j])
				array[k] = leftArray[i++];
			else
				array[k] = rightArray[j++];
		}
	} // end of merge method....

	public static void main(String[] args){
		//initiate the sorting by calling this method
		mergeSort(0,array.length-1);
		
		System.out.println("Array after sorting..");
		for(int data:array)
			System.out.print(data+" ");
		System.out.println();
	}	

}