package arrays;


class ReverseArray{
	static int[] array = {1,2,3,4,5,6,7,8};

	static void printArray(){
		for(int data : array)
			System.out.print(data + " ");
		System.out.println();
	}


	static void reverseArray(){
		int left = 0, right = array.length-1;
		while(left <= right)
			swap(left++, right--);
	}

	// swap the elements present at indices l and r in array.
	static void swap(int l, int r){
		array[r] = (array[l] + array[r]) - (array[l] = array[r]);
	}

	public static void main(String[] args){
		System.out.println("Before Reversing...:");
		printArray();
		
		//reverse the array
		reverseArray();
		
		System.out.println("After Reversing...:");
		printArray();

	}
}